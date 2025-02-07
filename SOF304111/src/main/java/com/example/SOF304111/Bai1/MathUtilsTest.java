package com.example.SOF304111.Bai1;

import com.example.SOF304111.Bai1.MathUtils;
import org.junit.Test;  // Sử dụng JUnit 4

import static org.junit.Assert.assertEquals;

public class MathUtilsTest {

    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals(20, MathUtils.multiply(4, 5));
    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals(0, MathUtils.multiply(0, 5));
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        assertEquals(20, MathUtils.multiply(-4, -5));
    }

    @Test
    public void testMultiplyPositiveAndNegative() {
        assertEquals(-20, MathUtils.multiply(4, -5));
    }

    @Test
    public void testMultiplyWithOne() {
        assertEquals(5, MathUtils.multiply(1, 5));
    }

    @Test
    public void testMultiplyLargeNumbers() {
        assertEquals(1000000, MathUtils.multiply(1000, 1000));
    }

    @Test
    public void testMultiplyMinValue() {
        assertEquals(0, MathUtils.multiply(Integer.MIN_VALUE, 0));
    }

    @Test
    public void testMultiplyMaxValue() {
        assertEquals(Integer.MAX_VALUE, MathUtils.multiply(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testMultiplyNegativeAndZero() {
        assertEquals(0, MathUtils.multiply(-5, 0));
    }

    @Test
    public void testMultiplySameNumbers() {
        assertEquals(25, MathUtils.multiply(5, 5));
    }
}
