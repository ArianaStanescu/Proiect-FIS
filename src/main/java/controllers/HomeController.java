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
    private Parent root;

    public void adminLogin(ActionEvent admin_login_event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("admin-login.fxml"));
        login_stage = (Stage)((Node)admin_login_event.getSource()).getScene().getWindow();
        login_scene = new Scene(root);
        login_stage.setScene(login_scene);
        login_stage.show();
        LoginController.actor = 1;
    }
    public void userLogin(ActionEvent user_login_event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("user-login.fxml"));
        login_stage = (Stage)((Node)user_login_event.getSource()).getScene().getWindow();
        login_scene = new Scene(root);
        login_stage.setScene(login_scene);
        login_stage.show();
        LoginController.actor = 0;
    }


}

