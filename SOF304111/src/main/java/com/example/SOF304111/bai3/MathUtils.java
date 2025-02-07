package com.example.SOF304111.bai3;

import java.util.List;

public class MathUtils {

    public static double average(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new ArithmeticException("List is empty");
        }
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}
