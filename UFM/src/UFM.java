package com.itdominator.ufm;

import com.itdominator.ufm.Utils.UFMLogger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import java.util.logging.Level;
import java.io.IOException;


public class UFM extends Application {
    // Classes
    private UFMLogger ufmLogger = UFMLogger.getInstance();

    @Override public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("resources/UFM_Win.fxml"));
            loader.setController(new Controller());
            loader.load();
            Scene scene = new Scene(loader.getRoot());
            scene.getStylesheets().add("/com/itdominator/ufm/resources/stylesheet.css");
            stage.setTitle("UFM");
            stage.setScene(scene);
        } catch (IOException startException) {
            String message = "\nUFM Failed to launch...\n";
            System.out.println(message + startException);
            ufmLogger.insertToLog(Level.SEVERE, message, startException);
        }
        stage.getIcons().add(new Image(UFM.class.getResourceAsStream("resources/UFM.png")));
        stage.setResizable(false);
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
