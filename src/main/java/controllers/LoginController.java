package controllers;


import com.example.library.HomeApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public static int actor;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent login_event) throws IOException {
        if(actor == 1) {
            root = FXMLLoader.load(AdminFunctions.class.getResource("admin-functions.fxml"));
            stage = (Stage)((Node)login_event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else {
            root = FXMLLoader.load(UserFunctions.class.getResource("user-functions.fxml"));
            stage = (Stage)((Node)login_event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }

    public void back(ActionEvent back_event) throws IOException {
        root = FXMLLoader.load(HomeApplication.class.getResource("home.fxml"));
        stage = (Stage)((Node)back_event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
