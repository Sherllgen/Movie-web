package com.example.Backend.model.enums;

public enum Gender {
    MALE, FEMALE, OTHER;

    public static Gender fromString(String gender) {
        try {
            return Gender.valueOf(gender.toUpperCase());
        } catch (IllegalArgumentException e) {
            return OTHER;
        }
    }

}
