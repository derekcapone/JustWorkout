package com.justworkout.desktopapp.controller.justworkout.workouttracking;

/**
 * Used to define the possible states that a workout can be in
 */
public enum WorkoutState {
    INACTIVE("Inactive"),
    ACTIVE("Active");

    private String label;

    WorkoutState(String label) {
        this.label = label;
    }

    private String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
