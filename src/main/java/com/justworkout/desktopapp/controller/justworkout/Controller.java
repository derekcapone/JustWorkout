package com.justworkout.desktopapp.controller.justworkout;

import com.justworkout.desktopapp.controller.justworkout.workouttracking.TimeControls;
import com.justworkout.desktopapp.controller.justworkout.workouttracking.WorkoutTimeControls;
import com.justworkout.desktopapp.controller.justworkout.workouttracking.WorkoutTimeTracker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    private static final Logger logger = LogManager.getLogger(Controller.class);

    /**
     * Instantiates a new controller
     */
    public Controller() {
        this.workoutTimeControls = new WorkoutTimeControls();
    }

    @Override
    public void beginWorkout() {
        logger.trace("Workout Started");
        workoutTimeControls.beginWorkout();
    }
    
    @Override
    public void finishWorkout() {
        logger.trace("Workout Finished");
        workoutTimeControls.finishWorkout();
    }

}
