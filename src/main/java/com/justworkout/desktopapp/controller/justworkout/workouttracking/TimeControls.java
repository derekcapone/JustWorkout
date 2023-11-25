package com.justworkout.desktopapp.controller.justworkout.workouttracking;

import javafx.beans.value.ObservableStringValue;

/**
 * Interface to begin, end, and track workout duration
 */
public interface TimeControls {

    /**
     * Begin
     * @param durationDisplay display observable for the time controls to update to show duration in seconds
     */
    public void beginWorkout(ObservableStringValue durationDisplay);

    /**
     *
     * @return {@link WorkoutResults} containing the results of the workout when it is complete
     */
    //TODO: implement WorkoutResults class and endWorkout method
    //public WorkoutResults endWorkout();



}
