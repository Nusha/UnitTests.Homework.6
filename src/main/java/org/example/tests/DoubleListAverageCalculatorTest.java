package org.example.tests;

import org.example.calculator.DoubleListAverageCalculator;
import org.example.calculator.ListAverageCalculator;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Класс DoubleListAverageCalculatorTest содержит тесты для класса DoubleListAverageCalculator.
 *
 * @author Ivan
 */

public class DoubleListAverageCalculatorTest {
    /**
     * Тест проверяет, что среднее значение списка чисел с плавающей точкой корректно вычисляется.
     */
    @Test
    public void testCalculateAverage() {
        //CHECKSTYLE:OFF: checkstyle:magicnumber
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        ListAverageCalculator calculator = new DoubleListAverageCalculator(numbers);
        double average = calculator.calculateAverage();
        assertEquals(3.0, average, 0.001);
        //CHECKSTYLE:ON: checkstyle:magicnumber
    }
    /**
     * Тест проверяет, что среднее значение пустого списка равно 0.
     */
    @Test
    public void testCalculateAverageZeroValue() {
        List<Double> numbers = List.of();
        ListAverageCalculator calculator = new DoubleListAverageCalculator(numbers);
        assertEquals(0, calculator.calculateAverage(), 0.0);
    }
    /**
     * Тест проверяет, что среднее значение не равно NaN.
     */
    @Test
    public void testCalculateAverageNotNull() {
        List<Double> numbers = List.of();
        ListAverageCalculator calculator = new DoubleListAverageCalculator(numbers);
        assertFalse(Double.isNaN(calculator.calculateAverage()));
    }

}
