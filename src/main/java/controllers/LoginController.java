package controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    private Stage login_stage;
    private Scene login_scene;
;
    private Parent root;

    public void loginManager(ActionEvent manager_event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login-manager.fxml"));
        login_stage = (Stage)((Node)manager_event.getSource()).getScene().getWindow();
        login_scene = new Scene(root);
        login_stage.setScene(login_scene);
        login_stage.show();
    }
    public void loginUser(ActionEvent user_event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login-user.fxml"));
        login_stage = (Stage)((Node)user_event.getSource()).getScene().getWindow();
        login_scene = new Scene(root);
        login_stage.setScene(login_scene);
        login_stage.show();
    }

}
