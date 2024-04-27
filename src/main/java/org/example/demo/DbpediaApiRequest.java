package org.example.demo;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import okhttp3.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DbpediaApiRequest {

    static final private String BASE_URL = "https://dbpedia.org/sparql";
    static final private OkHttpClient client = new OkHttpClient();
    static final private HttpUrl.Builder httpBuilder = Objects.requireNonNull(HttpUrl.parse(BASE_URL)).newBuilder();
    static private final Map<String,String> queryParams =  new HashMap<String, String>() {{
        put("default-graph-uri", "http://dbpedia.org");
        put("format", "text/html");
        put("timeout", "10000");
        put("query", "");
    }};

    public static String sendQuery(String query, Map<String,String>extraParams) {
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
                    htmlRes = response.body().string();
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
