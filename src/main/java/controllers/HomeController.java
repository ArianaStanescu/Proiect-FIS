package controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Parent;


public class HomeController {
    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    void handleButton1Action() throws Exception {
        // încarcă fișierul FXML pentru fereastra 1
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void handleButton2Action() throws Exception {
        // încarcă fișierul FXML pentru fereastra 2
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
}

