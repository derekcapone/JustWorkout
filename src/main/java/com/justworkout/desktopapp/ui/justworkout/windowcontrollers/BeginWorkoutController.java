package com.justworkout.desktopapp.ui.justworkout.windowcontrollers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BeginWorkoutController {

    @FXML
    private Label helloLabel;

    @FXML
    private void initialize() {
        helloLabel.setText("New Begin Workout Tab");
    }

}
