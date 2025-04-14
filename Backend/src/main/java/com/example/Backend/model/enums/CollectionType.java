package com.example.Backend.model.enums;

public enum CollectionType {
    WATCH_LATER,
    FAVORITE,
    CUSTOM;

    public static CollectionType fromString(String type) {
        for (CollectionType collectionType : CollectionType.values()) {
            if (collectionType.name().equalsIgnoreCase(type)) {
                return collectionType;
            }
        }
        throw new IllegalArgumentException("Unknown collection type: " + type);
    }
}
