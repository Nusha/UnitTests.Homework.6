package org.example.calculator;

import java.util.List;

/**
 * Этот класс расширяет ListAverageCalculator и переопределяет метод calculateAverage() для работы с списком чисел типа Double.
 * Он реализует интерфейс AverageCalculator и предоставляет метод для расчета среднего значения списка чисел типа Double.
 */
public class DoubleListAverageCalculator extends ListAverageCalculator implements AverageCalculator {
    /**
     * Конструктор для DoubleListAverageCalculator.
     *
     * @param numbers список чисел типа Double, для которых будет рассчитываться среднее значение.
     */
    public DoubleListAverageCalculator(final List<Double> numbers) {

        super(numbers);
    }

    /**
     * Переопределяет метод calculateAverage() из класса ListAverageCalculator для работы с числами типа Double.
     *
     * @return среднее значение списка чисел типа Double.
     */
    @Override
    public double calculateAverage() {
        return numbers.stream().mapToDouble(val -> (double) val).average().orElse(0.0);
    }
}

