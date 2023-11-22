package org.example.calculator;

import java.util.List;
/**
 * Этот класс используется для расчета среднего значения списка чисел.
 * Он реализует интерфейс AverageCalculator и предоставляет метод для расчета среднего значения списка.
 *
 * @param <T> тип чисел в списке, должен быть подклассом Number.
 */
public class ListAverageCalculator<T extends Number> implements AverageCalculator {
    /**
     * Список чисел, для которых рассчитывается среднее значение.
     */
    protected List<T> numbers;
    /**
     * Конструктор для ListAverageCalculator.
     *
     * @param inNumbers список чисел, для которых будет рассчитываться среднее значение.
     */
    public ListAverageCalculator(final List<T> inNumbers) {
        this.numbers = inNumbers;
    }
    /**
     * Метод вычисляет среднее значение списка чисел.
     *
     * @return среднее значение списка чисел.
     */
    public double calculateAverage() {
        return numbers.stream().mapToInt(val -> (int) val).average().orElse(0.0);
    }

}
