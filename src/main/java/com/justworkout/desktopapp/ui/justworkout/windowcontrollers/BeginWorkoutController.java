package com.justworkout.desktopapp.ui.justworkout.windowcontrollers;

import com.justworkout.desktopapp.controller.justworkout.workouttracking.TimeControls;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BeginWorkoutController {

    private static final Logger logger = LogManager.getLogger(BeginWorkoutController.class);

    @FXML
    private Button startAndEndWorkout;

    @FXML
    private Label workoutDurationLabel;

    /**
     * TimeControls interface to handle the controller-side of the "Begin Workout" tab
     */
    private TimeControls timeControls;

    @FXML
    private void initialize() {
        // Workout begins here
        startAndEndWorkout.setOnAction(e -> {
            handleBeginWorkout();
            changeToFinishWorkoutButton();
        });
    }

    private void changeToFinishWorkoutButton() {
        startAndEndWorkout.setText("Finish Workout");

        startAndEndWorkout.setOnAction(e -> {
            handleFinishWorkout();
            changeToStartWorkoutButton();
        });
    }

    private void changeToStartWorkoutButton() {
        startAndEndWorkout.setText("Start Workout");

        startAndEndWorkout.setOnAction(e -> {
            changeToFinishWorkoutButton();
        });
    }

    /**
     * Begins the workout in the Controller
     */
    private void handleBeginWorkout() {
        timeControls.beginWorkout();
    }

    private void handleFinishWorkout() {
        timeControls.finishWorkout();
    }

    /**
     * Sets the timeControls interface to the object implementing it
     */
    public void setTimeControls(TimeControls timeControls) {
        this.timeControls = timeControls;
    }

}
