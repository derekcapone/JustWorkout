package com.justworkout.desktopapp.ui.justworkout;

import com.justworkout.desktopapp.ui.justworkout.windowcontrollers.BeginWorkoutController;
import com.justworkout.desktopapp.ui.justworkout.windowcontrollers.WorkoutHistoryController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainWindowController {

    @FXML
    private BeginWorkoutController beginWorkoutController;
    @FXML
    private WorkoutHistoryController workoutHistoryController;

    @FXML
    public void initialize() {
        System.out.println("Hello world");
    }

}