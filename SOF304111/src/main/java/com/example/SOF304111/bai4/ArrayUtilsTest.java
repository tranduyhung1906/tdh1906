package com.example.SOF304111.bai4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    void testGetElementAtValidIndex() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(3, ArrayUtils.getElementAtIndex(arr, 2));
    }

    @Test
    void testGetElementAtNegativeIndex() {
        int[] arr = {1, 2, 3, 4, 5};
        assertThrows(IndexOutOfBoundsException.class, () -> ArrayUtils.getElementAtIndex(arr, -1));
    }

    @Test
    void testGetElementAtIndexOutOfBounds() {
        int[] arr = {1, 2, 3, 4, 5};
        assertThrows(IndexOutOfBoundsException.class, () -> ArrayUtils.getElementAtIndex(arr, 5));
    }

    @Test
    void testGetElementAtIndexEmptyArray() {
        int[] arr = {};
        assertThrows(IndexOutOfBoundsException.class, () -> ArrayUtils.getElementAtIndex(arr, 0));
    }
}
