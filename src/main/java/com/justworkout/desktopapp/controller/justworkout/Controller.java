package com.justworkout.desktopapp.controller.justworkout;

import com.justworkout.desktopapp.controller.justworkout.workouttracking.TimeControls;
import com.justworkout.desktopapp.controller.justworkout.workouttracking.WorkoutTimeControls;

/**
 * Controller that handles all logic for controlling the data and UI layers
 * Controller is a Singleton and will only ever have one instance
 *
 * TimeControls handles the workout tracking functionality
 */
public class Controller implements TimeControls {

    /**
     * Time Controls for workout duration tracking and workout results
     */
    private final WorkoutTimeControls workoutTimeControls;

    /**
     * Instantiates a new controller
     */
    public Controller() {
        this.workoutTimeControls = new WorkoutTimeControls();
    }

    @Override
    public void beginWorkout() {
        workoutTimeControls.beginWorkout();
    }

}
