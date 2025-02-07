package com.example.SOF304111.bai5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserProfileTest {

    @Test
    void testGetNameValid() {
        UserProfile user = new UserProfile("John Doe");
        assertEquals("John Doe", user.getName());
    }

    @Test
    void testGetNameNull() {
        UserProfile user = new UserProfile(null);
        assertThrows(NullPointerException.class, user::getName);
    }

    @Test
    void testGetNameEmpty() {
        UserProfile user = new UserProfile("");
        assertThrows(NullPointerException.class, user::getName);
    }
}
