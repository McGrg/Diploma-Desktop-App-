package com.mcgrg.diploma.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("TestForm.fxml"));
        primaryStage.setTitle("TestView");
        primaryStage.setScene(new Scene(root, 960, 800));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
