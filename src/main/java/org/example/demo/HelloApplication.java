package org.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import okhttp3.*;

import java.io.IOException;

public class HelloApplication extends Application {

    private static final String OLLAMA_API_URL = "https://api.ollama.ai/";
    private static final OkHttpClient client = new OkHttpClient();

    @Override
    public void start(Stage stage) {
        // Creating a TextField
        TextField textField = new TextField();
        textField.setPromptText("Enter text");

        // Creating a Button
        Button button = new Button("Send to Ollama");
        button.setOnAction(event -> {
            // Action to perform when the button is clicked
            String text = textField.getText();
            sendToOllama(text);
        });

        // Creating a layout to hold TextField and Button
        VBox root = new VBox(10); // spacing between elements
        root.getChildren().addAll(textField, button);

        // Creating the scene
        Scene scene = new Scene(root, 320, 240);

        // Setting the scene
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX!");
        stage.show();
    }

    private void sendToOllama(String text) {
        // Constructing the request body
        RequestBody body = new FormBody.Builder()
                .add("text", text)
                .build();

        // Creating the request
        Request request = new Request.Builder()
                .url(OLLAMA_API_URL)
                .post(body)
                .build();

        // Sending the request asynchronously
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                }
                String responseBody = response.body().string();
                System.out.println("Ollama API Response: " + responseBody);
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
