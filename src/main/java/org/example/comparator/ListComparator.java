package org.example.comparator;

import org.example.calculator.AverageCalculator;

public class ListComparator implements Comparator {

    private final AverageCalculator firstListCalculator;
    private final AverageCalculator secondListCalculator;

    public ListComparator(AverageCalculator firstListCalculator, AverageCalculator secondListCalculator) {
        if (firstListCalculator == null || secondListCalculator == null) {
            throw new IllegalArgumentException("Значения списков не могут быть нулевыми");
        }
        this.firstListCalculator = firstListCalculator;
        this.secondListCalculator = secondListCalculator;
    }

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

