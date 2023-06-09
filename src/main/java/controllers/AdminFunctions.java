package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class AdminFunctions {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void viewUsers(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("admin-functions/view-users.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void addUser(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("admin-functions/add-user.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
