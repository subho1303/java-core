package com.learning.core.day10;

public class UserProfile {
    public void validateUsername(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }

        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Username must contain only characters");
        }
    }

    public void validatePassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }

        if (password.length() != 8) {
            throw new IllegalArgumentException("Password must be of length 8");
        }

        if (!password.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Password must contain alphabets and digits only");
        }
    }
}