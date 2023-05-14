package controllers.adminfunctions;

import controllers.AdminFunctions;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AddUserController {
    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    public void back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(AdminFunctions.class.getResource("admin-functions.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void login(ActionEvent event) throws IOException {
        root = FXMLLoader.load(AdminFunctions.class.getResource("admin-functions.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
