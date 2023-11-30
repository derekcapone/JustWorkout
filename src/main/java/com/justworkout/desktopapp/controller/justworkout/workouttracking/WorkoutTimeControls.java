package com.justworkout.desktopapp.controller.justworkout.workouttracking;

/**
 * Used to control the timing of active workouts
 */
public class WorkoutTimeControls {

    /** Private fields **/

    /**
     * Holds the current workout state
     */
    private WorkoutState workoutState;

    private WorkoutTimeTracker workoutTimeTracker;

    private Thread timeTracker;

    /**
     * Construct the WorkoutTimeControls class and initializes workout state to INACTIVE
     */
    public WorkoutTimeControls() {
        workoutState = WorkoutState.INACTIVE;
        workoutTimeTracker = new WorkoutTimeTracker(this);
    }

    /**
     * Begins the workout timing
     */
    public void beginWorkout() {
        // Check if workout is already active
        if(workoutState == WorkoutState.ACTIVE) {
            throw new IllegalStateException("Workout is already active ");
        }

        this.setWorkoutState(WorkoutState.ACTIVE);

        timeTracker = new Thread(workoutTimeTracker);
        timeTracker.start();
    }

    public void finishWorkout() {
        // Make sure there is an active workout
        if(workoutState == WorkoutState.INACTIVE) {
            throw new IllegalStateException("No active workout but expected there to be");
        }

        this.setWorkoutState(WorkoutState.INACTIVE);
    }

    /**
     * Getter for workout state
     * @return Current {@link WorkoutState} value
     */
    public WorkoutState getWorkoutState() {
        return workoutState;
    }

    /**
     * Sets the current workout state
     * @param workoutState state to set the current workout state to
     */
    public void setWorkoutState(WorkoutState workoutState) {
        this.workoutState = workoutState;
    }
}
