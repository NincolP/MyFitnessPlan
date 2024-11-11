package org.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //System.out.println("javafx.runtime.version: " + System.getProperty("javafx.runtime.version"));

        //System.exit(0);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 440);
        stage.setTitle("Your Fitness Plan!");
        stage.setScene(scene);
        stage.show();




    }

    public static void main(String[] args) {
        launch();
    }


}