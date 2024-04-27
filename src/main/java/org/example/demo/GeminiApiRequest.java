package org.example.demo;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import okhttp3.*;

import java.io.IOException;

public class GeminiApiRequest {

    public static String generateContent(String queryText) {
        OkHttpClient client = new OkHttpClient();

        // Replace "YOUR_API_KEY" with your actual Google API key
        String apiKey = "AIzaSyAXdsMLYA8_g95nBiPuQ35-wX4TSXbGea4";
        String url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent?key=" + apiKey;
        String queryHeader = "write sparql query and return only the sparql query without any extra characters and make sure it's valid and will return answer from dbpedia: ";
        String query = queryHeader + queryText;
        // JSON request body
        String jsonReq = "{\"contents\":[{\"parts\":[{\"text\":\"" + query + "\"}]}]}";

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(jsonReq, mediaType);
        // Create a Gson instance

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("Content-Type", "application/json")
                .build();

        // Execute the request and handle the response
        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                Gson gson = new Gson();
                JsonObject jsonObject = gson.fromJson(response.body().string(), JsonObject.class);
                System.out.println(jsonObject);

                // Extract the "candidates" array directly
                JsonArray candidatesArray = jsonObject.getAsJsonArray("candidates");
                System.out.println(candidatesArray);

                // Extract the "text" field from the first element of the "parts" array within the "content" object
                String text = candidatesArray.get(0).getAsJsonObject().getAsJsonObject("content").getAsJsonArray("parts").get(0).getAsJsonObject().get("text").getAsString();
                System.out.println("OMAR ::: " + text);
                text = text.replaceAll("```", "");
                text = text.replaceAll("sparql", "");

                return text;
            } else {
                System.out.println("Request failed: " + response);
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return apiKey;
    }


    public static String refineContent(String queryText) {
        OkHttpClient client = new OkHttpClient();

        // Replace "YOUR_API_KEY" with your actual Google API key
        String apiKey = "AIzaSyAXdsMLYA8_g95nBiPuQ35-wX4TSXbGea4";
        String url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent?key=" + apiKey;
        String queryHeader = "fix this sparql query and return it without any extra characters: ";
        String query = queryHeader + queryText;
        // JSON request body
        String jsonReq = "{\"contents\":[{\"parts\":[{\"text\":\"" + query + "\"}]}]}";

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(jsonReq, mediaType);
        // Create a Gson instance

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("Content-Type", "application/json")
                .build();

        // Execute the request and handle the response
        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                Gson gson = new Gson();
                JsonObject jsonObject = gson.fromJson(response.body().string(), JsonObject.class);
                System.out.println(jsonObject);

                // Extract the "candidates" array directly
                JsonArray candidatesArray = jsonObject.getAsJsonArray("candidates");
                System.out.println(candidatesArray);

                // Extract the "text" field from the first element of the "parts" array within the "content" object
                String text = candidatesArray.get(0).getAsJsonObject().getAsJsonObject("content").getAsJsonArray("parts").get(0).getAsJsonObject().get("text").getAsString();
                System.out.println("OMAR ::: " + text);
                text = text.replaceAll("```", "");
                text = text.replaceAll("sparql", "");

                return text;
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
