package com.justworkout.desktopapp.ui.justworkout;

import com.justworkout.desktopapp.controller.justworkout.Controller;
import com.justworkout.desktopapp.ui.justworkout.windowcontrollers.BeginWorkoutController;
import com.justworkout.desktopapp.ui.justworkout.windowcontrollers.WorkoutHistoryController;
import javafx.fxml.FXML;

public class MainWindowController {

    @FXML
    private BeginWorkoutController beginWorkoutController;
    @FXML
    private WorkoutHistoryController workoutHistoryController;

    // Singleton Controller that is the brains of the operation
    private static final Controller controller = new Controller();

    @FXML
    public void initialize() {
        beginWorkoutController.setTimeControls(controller);
    }
}