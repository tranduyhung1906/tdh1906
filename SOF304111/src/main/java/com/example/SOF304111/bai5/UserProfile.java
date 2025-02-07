package com.example.SOF304111.bai5;

public class UserProfile {
    private String name;

    public UserProfile(String name) {
        this.name = name;
    }

    public String getName() {
        if (name == null || name.isEmpty()) {
            throw new NullPointerException("Name is null or empty");
        }
        return name;
    }
}
