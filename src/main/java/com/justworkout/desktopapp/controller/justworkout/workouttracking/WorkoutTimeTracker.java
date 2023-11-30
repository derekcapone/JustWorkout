package com.justworkout.desktopapp.controller.justworkout.workouttracking;

public class WorkoutTimeTracker implements Runnable {

    /**
     * Instance of {@link WorkoutTimeControls} to report back to
     */
    private final WorkoutTimeControls workoutTimeControls;

    public WorkoutTimeTracker(WorkoutTimeControls workoutTimeControls) {
        System.out.println("Instantiated WorkoutTimeTracker");
        this.workoutTimeControls = workoutTimeControls;
    }

    @Override
    public void run() {
        while(workoutTimeControls.getWorkoutState() == WorkoutState.ACTIVE){
            System.out.println("Hello");
            wait1Second();
        }
        System.out.println("Workout Complete");
        //workoutTimeControls.retrieveWorkoutResults();
    }

    private void wait1Second() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
