module com.example.library {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.library to javafx.fxml;
    exports com.example.library;
    exports controllers;
    opens controllers to javafx.fxml;
    exports controllers.adminfunctions;
    opens controllers.adminfunctions to javafx.fxml;
}