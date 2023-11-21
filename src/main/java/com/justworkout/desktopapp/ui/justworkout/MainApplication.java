package com.justworkout.desktopapp.ui.justworkout;

import javafx.fxml.FXML;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

    private static final Logger logger = LogManager.getLogger(MainApplication.class);

    @FXML
    private MainWindowController mainWindowController;

    @Override
    public void start(Stage stage) throws IOException {
        logger.debug("Starting the application");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(("fxml/MainApplication.fxml")));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("JustWorkout");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}