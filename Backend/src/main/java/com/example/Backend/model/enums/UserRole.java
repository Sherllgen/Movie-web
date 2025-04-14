package com.example.Backend.model.enums;

public enum UserRole {
    ADMIN, USER;

    public static UserRole fromString(String role) {
        for (UserRole userRole : UserRole.values()) {
            if (userRole.name().equalsIgnoreCase(role)) {
                return userRole;
            }
        }
        throw new IllegalArgumentException("No enum constant " + UserRole.class.getCanonicalName() + "." + role);
    }
}
