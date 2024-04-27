package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Map;

public class MainController {
    @FXML
    private TextField promptTextBx;

    @FXML
    private TextArea queryTextAr;

    @FXML
    private Button generateBtn;

    @FXML
    private Button executeBtn;

    private static final String OLLAMA_API_URL = "http://localhost:11434/";

    @FXML
    protected void onGenerateBtnClick() {
        String response = GeminiApiRequest.generateContent(promptTextBx.getText());
        queryTextAr.setText(response);
    }

    @FXML
    protected void onExecuteBtnClick(ActionEvent event) throws IOException {
        String testQuery = "SELECT ?person ?birthDate\n" +
                "WHERE {\n" +
                "  ?person rdf:type dbo:Person.\n" +
                "  ?person dbo:birthDate ?birthDate.\n" +
                "}\n" +
                "LIMIT 10";
        String res = DbpediaApiRequest.sendQuery(testQuery, null);
        SceneController.switchToResultView(event, res);
    }
}