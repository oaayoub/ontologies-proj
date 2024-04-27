package org.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApplication extends Application {

    private static final String OLLAMA_API_URL = "http://localhost:11434/";
    private final GeminiApiRequest geminiApiRequest = new GeminiApiRequest();

    @Override
    public void start(Stage stage) {
        // Creating a TextField
        TextField textField = new TextField();
        textField.setPromptText("Enter text");

        // Creating a Button
        Button button = new Button("Send to Gemini");
        button.setOnAction(event -> {
            // Action to perform when the button is clicked
            String text = textField.getText();
            try {
                // TextArea to display generated content
                TextArea contentArea = new TextArea();

                // Send request and update TextArea
                String response = geminiApiRequest.generateContent(text);
                contentArea.setText(response);

                // Layout update
                VBox root = new VBox(10); // spacing between elements
                root.getChildren().addAll(textField, button, contentArea);

                // Update scene with contentArea
                stage.setScene(new Scene(root, 320, 340)); // Adjust height for TextArea
            } catch (Exception e) {
                e.printStackTrace();
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
