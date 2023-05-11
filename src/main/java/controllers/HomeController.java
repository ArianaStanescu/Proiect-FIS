package controllers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Parent;

import java.io.IOException;


public class HomeController {
    private Stage login_stage;
    private Scene login_scene;
    ;
    private Parent root;

    public void loginManager(ActionEvent login_event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login-manager.fxml"));
        login_stage = (Stage)((Node)login_event.getSource()).getScene().getWindow();
        login_scene = new Scene(root);
        login_stage.setScene(login_scene);
        login_stage.show();
    }
    public void loginUser(ActionEvent login_event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login-user.fxml"));
        login_stage = (Stage)((Node)login_event.getSource()).getScene().getWindow();
        login_scene = new Scene(root);
        login_stage.setScene(login_scene);
        login_stage.show();
    }


}

