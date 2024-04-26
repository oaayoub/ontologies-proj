package org.example.demo;

import io.github.amithkoujalgi.ollama4j.core.OllamaAPI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import okhttp3.OkHttpClient;

import java.io.IOException;

public class HelloApplication extends Application {

    private static final String OLLAMA_API_URL = "http://localhost:11434/";
    private static final OkHttpClient client = new OkHttpClient();
    OllamaAPI ollamaAPI = new OllamaAPI(OLLAMA_API_URL);

    @Override
    public void start(Stage stage) throws Exception {
        // Creating a TextField
        TextField textField = new TextField();
        textField.setPromptText("Enter text");
        ollamaAPI.setVerbose(true);

        boolean isOllamaServerReachable = ollamaAPI.ping();

        System.out.println("Is Ollama server alive: " + isOllamaServerReachable);

        // Creating a Button
        Button button = new Button("Send to Ollama");
        button.setOnAction(event -> {
            // Action to perform when the button is clicked
            String text = textField.getText();
            try {
                // TextArea to display generated query
                TextArea queryArea = new TextArea();

//                String query = "Write sparql query for the following , **I'd like you to process the following SPARQL query, but I'm only interested in the raw query itself. Please don't provide explanations or additional information.**\n ``` ";
//                query += text;
//                query += "```";
//
//                // Send request and update TextArea
//                OllamaResult result = ollamaAPI.generate("tinyllama", query, new OptionsBuilder().build());
//                queryArea.setText(result.getResponse());
                String res = GeminiApiRequest.SendRequest("bla bla");
                System.out.println("Response inside main app: " + res);
                // Layout update
                VBox root = new VBox(10); // spacing between elements
                root.getChildren().addAll(textField, button, queryArea);

                // Update scene with queryArea
                stage.setScene(new Scene(root, 320, 340)); // Adjust height for TextArea
            }
//            catch (OllamaBaseException e) {
//                throw new RuntimeException(e);
//            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        // Creating a layout to hold TextField and Button
        VBox root = new VBox(10);
        root.getChildren().addAll(textField, button);

        // Creating the scene
        Scene scene = new Scene(root, 320, 240);

        // Setting the scene
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX!");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
