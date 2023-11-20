package org.example.tests;

import org.example.calculator.DoubleListAverageCalculator;
import org.example.calculator.ListAverageCalculator;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DoubleListAverageCalculatorTest {
    @Test
    public void testCalculateAverage() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        ListAverageCalculator calculator = new DoubleListAverageCalculator(numbers);
        double average = calculator.calculateAverage();
        assertEquals(3.0, average, 0.001);
    }

    @Test
    public void testCalculateAverageZeroValue() {
        List<Double> numbers = List.of();
        ListAverageCalculator calculator = new DoubleListAverageCalculator(numbers);
        assertEquals(0, calculator.calculateAverage(), 0.0);
    }

    @Test
    public void testCalculateAverageNotNull() {
        List<Double> numbers = List.of();
        ListAverageCalculator calculator = new DoubleListAverageCalculator(numbers);
        assertFalse(Double.isNaN(calculator.calculateAverage()));
    }
}