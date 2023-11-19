package com.justworkout.desktopapp.ui.justworkout.windowcontrollers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WorkoutHistoryController {

    @FXML
    private Label newLabel;

    @FXML
    private void initialize() {
        newLabel.setText("New Workout History Tab");
    }

}
