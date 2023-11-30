package com.justworkout.desktopapp.controller.justworkout.workouttracking;

import com.justworkout.desktopapp.ui.justworkout.MainApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WorkoutTimeTracker implements Runnable {

    /**
     * Instance of {@link WorkoutTimeControls} to report back to
     */
    private final WorkoutTimeControls workoutTimeControls;

    private static final Logger logger = LogManager.getLogger(WorkoutTimeTracker.class);

    public WorkoutTimeTracker(WorkoutTimeControls workoutTimeControls) {
        logger.trace("Instantiated WorkoutTimeTracker");
        this.workoutTimeControls = workoutTimeControls;
    }

    @Override
    public void run() {
        while(workoutTimeControls.getWorkoutState() == WorkoutState.ACTIVE){
            // TODO: Implement time tracking of workout
            logger.debug("Tracking is occurring");
            wait1Second();
        }
        System.out.println("Workout Complete");

        // TODO: Send workout results back to WorkoutTimeControls
    }

    private void wait1Second() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
