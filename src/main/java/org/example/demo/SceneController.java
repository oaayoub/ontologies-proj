package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class SceneController {
    private static Stage stage;
    private static Scene scene;
    private static Parent root;


    public static void switchToResultView(ActionEvent event, String data) throws IOException {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull((SceneController.class).getResource("result-view.fxml")));
        ResultViewController resultViewController = new ResultViewController();
        resultViewController.setHtmlData(data);
        loader.setController(resultViewController);
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void switchToMainView(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(SceneController.class.getResource("main-view.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



}
