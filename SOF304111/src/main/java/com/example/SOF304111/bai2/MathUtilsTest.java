package com.example.SOF304111.bai2;

import org.junit.jupiter.api.Test;  // Sử dụng JUnit 5
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> MathUtils.divide(10, 0));
    }

    @Test
    void testDividePositiveNumbers() {
        assertEquals(5, MathUtils.divide(10, 2));
    }

    @Test
    void testDivideNegativeNumbers() {
        assertEquals(5, MathUtils.divide(-10, -2));
    }

    @Test
    void testDividePositiveAndNegative() {
        assertEquals(-5, MathUtils.divide(10, -2));
    }

    @Test
    void testDivideByOne() {
        assertEquals(10, MathUtils.divide(10, 1));
    }
}
