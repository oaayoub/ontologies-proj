package org.example.demo;

import okhttp3.*;

import java.io.IOException;

public class GeminiApiRequest {

    public static String SendRequest(String queryText) {
        OkHttpClient client = new OkHttpClient();

        // Replace "YOUR_API_KEY" with your actual Google API key
        String apiKey = "AIzaSyAXdsMLYA8_g95nBiPuQ35-wX4TSXbGea4";
        String url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent?key=" + apiKey;
        queryText = "get all players that have christiano in there name";

        String queryHeader = "write sparql query and return only the sparql query without any extra characters and make sure it's valid and will return answer from dbpedia: ";
        String query = queryHeader + queryText;
        // JSON request body
        String json = "{\"contents\":[{\"parts\":[{\"text\":\"" + query + "\"}]}]}";

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(json, mediaType);

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("Content-Type", "application/json")
                .build();

        // Execute the request and handle the response
        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                System.out.println("Response Body: " + response.body().string());
                return response.body().string();
            } else {
                System.out.println("Request failed: " + response);
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return apiKey;
    }
}
