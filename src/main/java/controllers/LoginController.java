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
    private Stage home_stage;
    private Scene home_scene;
;
    private Parent root;

    public void back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(HomeApplication.class.getResource("home.fxml"));
        home_stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        home_scene = new Scene(root);
        home_stage.setScene(home_scene);
        home_stage.show();
    }

}
