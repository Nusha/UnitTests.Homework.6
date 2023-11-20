package org.example.tests;

import org.example.calculator.ListAverageCalculator;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListAverageCalculatorTest {
    @Test
    public void testCalculateAverage() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        ListAverageCalculator calculator = new ListAverageCalculator(numbers);
        double average = calculator.calculateAverage();
        assertEquals(3.0, average, 0.001);
    }

    @Test
    public void testCalculateAverageZeroValue() {
        List<Integer> numbers = List.of();
        ListAverageCalculator calculator = new ListAverageCalculator(numbers);
        assertEquals(0, calculator.calculateAverage(), 0.0);
    }

    @Test
    public void testCalculateAverageNotNull() {
        List<Integer> numbers = List.of();
        ListAverageCalculator calculator = new ListAverageCalculator(numbers);
        assertFalse(Double.isNaN(calculator.calculateAverage()));
    }
}

