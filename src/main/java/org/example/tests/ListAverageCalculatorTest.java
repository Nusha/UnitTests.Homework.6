package org.example.tests;

import org.example.calculator.ListAverageCalculator;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
/**
 * Класс ListAverageCalculatorTest содержит тесты для класса ListAverageCalculator.
 *
 * @author Ivan
 */
public class ListAverageCalculatorTest {
    /**
     * Тест проверяет, что среднее значение списка чисел корректно вычисляется.
     */
    @Test
    public void testCalculateAverage() {
        @SuppressWarnings("checkstyle:magicnumber")
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        ListAverageCalculator calculator = new ListAverageCalculator(numbers);
        double average = calculator.calculateAverage();
        //CHECKSTYLE:OFF: checkstyle:magicnumber
        assertEquals(3.0, average, 0.001);
        //CHECKSTYLE:ON: checkstyle:magicnumber
    }
    /**
     * Тест проверяет, что среднее значение пустого списка равно 0.
     */
    @Test
    public void testCalculateAverageZeroValue() {
        List<Integer> numbers = List.of();
        ListAverageCalculator calculator = new ListAverageCalculator(numbers);
        assertEquals(0, calculator.calculateAverage(), 0.0);
    }
    /**
     * Тест проверяет, что среднее значение не равно NaN.
     */
    @Test
    public void testCalculateAverageNotNull() {
        List<Integer> numbers = List.of();
        ListAverageCalculator calculator = new ListAverageCalculator(numbers);
        assertFalse(Double.isNaN(calculator.calculateAverage()));
    }
}

