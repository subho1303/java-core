package com.learning.core.day10;

import org.junit.Test;

public class D10P10 {

    @Test(timeout = 2000)
    public void testName() {
        UserProfile userProfile = new UserProfile();
        userProfile.validateUsername("JohnDoe");
    }

    @Test(timeout = 2000)
    public void testPassword() {
        UserProfile userProfile = new UserProfile();
        userProfile.validatePassword("Pass1234");
    }
}