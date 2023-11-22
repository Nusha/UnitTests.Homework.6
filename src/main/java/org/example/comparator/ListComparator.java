package org.example.comparator;

import org.example.calculator.AverageCalculator;

/**
 * Этот класс используется для сравнения средних значений двух списков.
 * Он использует два экземпляра AverageCalculator для расчета среднего значения каждого списка.
 */
public class ListComparator implements Comparator {
    /**
     * Экземпляр AverageCalculator для первого списка.
     */
    private final AverageCalculator firstListCalculator;
    /**
     * Экземпляр AverageCalculator для второго списка.
     */
    private final AverageCalculator secondListCalculator;

    /**
     * Конструктор для ListComparator.
     *
     * @param inFirstListCalculator  Экземпляр AverageCalculator для первого списка.
     * @param inSecondListCalculator Экземпляр AverageCalculator для второго списка.
     * @throws IllegalArgumentException если один из экземпляров AverageCalculator равен null.
     */
    public ListComparator(final AverageCalculator inFirstListCalculator, final AverageCalculator inSecondListCalculator) {
        if (inFirstListCalculator == null || inSecondListCalculator == null) {
            throw new IllegalArgumentException("Значения списков не могут быть нулевыми");
        }
        this.firstListCalculator = inFirstListCalculator;
        this.secondListCalculator = inSecondListCalculator;

    }

    /**
     * Сравнивает средние значения двух списков.
     *
     * @return строку, указывающую, какой список имеет большее среднее значение, или сообщение о том, что средние значения равны.
     */
    @Override
    public Object compare() {
        Double firstAverage = firstListCalculator.calculateAverage();
        Double secondAverage = secondListCalculator.calculateAverage();

        if (firstAverage > secondAverage) {
            return "Первый список имеет большее среднее значение";
        } else if (secondAverage > firstAverage) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}

