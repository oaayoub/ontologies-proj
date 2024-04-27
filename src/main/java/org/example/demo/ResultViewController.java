package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ResultViewController implements Initializable {

    private String htmlData = "";

    @FXML
    private WebView webView;

    @FXML
    private Button backBtn;


    public String getHtmlData() {
        return htmlData;
    }

    public void setHtmlData(String htmlData) {
        this.htmlData = htmlData;
    }

    @FXML
    public void switchToMainScene(ActionEvent e) throws IOException {
        SceneController.switchToMainView(e);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        WebEngine engine = this.webView.getEngine();
        engine.loadContent(getHtmlData());
    }
}
