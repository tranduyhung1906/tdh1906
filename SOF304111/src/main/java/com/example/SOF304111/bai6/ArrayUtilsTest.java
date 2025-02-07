package com.example.SOF304111.bai6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    void testFindMinWithValidArray() {
        int[] arr = {5, 3, 7, 1, 9};
        assertEquals(1, ArrayUtils.findMin(arr));
    }

    @Test
    void testFindMinWithSingleElement() {
        int[] arr = {4};
        assertEquals(4, ArrayUtils.findMin(arr));
    }

    @Test
    void testFindMinWithNegativeNumbers() {
        int[] arr = {-1, -5, -3, 0};
        assertEquals(-5, ArrayUtils.findMin(arr));
    }

    @Test
    void testFindMinWithEmptyArray() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMin(arr));
    }

    @Test
    void testFindMinWithNullArray() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMin(null));
    }
}
