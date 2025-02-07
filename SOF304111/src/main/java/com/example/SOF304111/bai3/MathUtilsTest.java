package com.example.SOF304111.bai3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    void testAverageEmptyList() {
        assertThrows(ArithmeticException.class, () -> MathUtils.average(new ArrayList<>()));
    }

    @Test
    void testAveragePositiveNumbers() {
        assertEquals(3.0, MathUtils.average(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    void testAverageSingleElement() {
        assertEquals(10.0, MathUtils.average(Arrays.asList(10)));
    }

    @Test
    void testAverageWithNegativeNumbers() {
        assertEquals(0.0, MathUtils.average(Arrays.asList(-5, 5)));
    }

    @Test
    void testAverageAllZeroes() {
        assertEquals(0.0, MathUtils.average(Arrays.asList(0, 0, 0, 0)));
    }
}
