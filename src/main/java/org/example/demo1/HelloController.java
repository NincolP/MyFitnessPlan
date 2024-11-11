package org.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    public Button register;
    @FXML
    private Label welcomeText;

    public void registerButton(ActionEvent actionEvent) throws IOException {
       Stage registration = new Stage();
       registration.setTitle("Registration");

        FXMLLoader registrationLoader = new FXMLLoader(HelloApplication.class.getResource("registration-view.fxml"));
        Scene scene = new Scene(registrationLoader.load(), 520, 440);
        registration.setScene(scene);
        registration.show();

        //Closing previous scene
        ((Stage) register.getScene().getWindow()).close();
    }
}