package com.example.Backend.model.enums;

public enum MovieStatus {
    RELEASED,
    COMING_SOON,
    IN_THEATERS,
    FINISHED, // for series
    UNKNOWN;

    public static MovieStatus fromString(String status) {
        try {
            return MovieStatus.valueOf(status.toUpperCase());
        } catch (IllegalArgumentException e) {
            return UNKNOWN;
        }
    }
}
