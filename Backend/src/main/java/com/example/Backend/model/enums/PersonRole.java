package com.example.Backend.model.enums;

public enum PersonRole {
    DIRECTOR, ACTOR;

    public static PersonRole fromString(String role) {
        for (PersonRole personRole : PersonRole.values()) {
            if (personRole.name().equalsIgnoreCase(role)) {
                return personRole;
            }
        }
        throw new IllegalArgumentException("No enum constant " + PersonRole.class.getCanonicalName() + "." + role);
    }
}
