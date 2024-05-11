package org.example.demo;
import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DbpediaApiRequest {

    static final private String BASE_URL = "http://localhost:3030/SportsOntology/query";
    static final private OkHttpClient client = new OkHttpClient();
    static final private HttpUrl.Builder httpBuilder = Objects.requireNonNull(HttpUrl.parse(BASE_URL)).newBuilder();
    static private final Map<String,String> queryParams =  new HashMap<String, String>() {{
        put("output", "json");
        put("query", "");
    }};



    public static String sendQuery(String query, Map<String,String>extraParams) {
        String jsonRes = "";
        String htmlRes = "";
        if (extraParams != null) {
            for(Map.Entry<String, String> param : extraParams.entrySet()) {
                httpBuilder.addQueryParameter(param.getKey(),param.getValue());
            }
        }
        if(query != null && !query.isEmpty()){
            queryParams.put("query", query);
            for(Map.Entry<String, String> param : queryParams.entrySet()) {
                httpBuilder.addQueryParameter(param.getKey(), param.getValue());
            }
            Request request = new Request.Builder().url(httpBuilder.build()).build();
            try{
                Response response = client.newCall(request).execute();
                if(response.isSuccessful()){
                    jsonRes = response.body().string();
                    Map res = new Gson().fromJson(jsonRes, Map.class);
                    HTMLResultViewBuilder viewBuilder = HTMLResultViewBuilder.newBuilder();
                    viewBuilder = viewBuilder.setHeader((List)((Map) res.get("head")).get("vars"));
                    for(Map row: (List<Map>)((Map)res.get("results")).get("bindings")){
                        viewBuilder = viewBuilder.addRow(row);
                    }
                    htmlRes = viewBuilder.build();
                    System.out.println(htmlRes);
                } else {
                    System.out.println("bad request");
                }
            } catch (IOException e){
                e.printStackTrace();
            }

        }
        return htmlRes;
    }
}
