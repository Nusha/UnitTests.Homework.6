package org.example.comparator;

import org.example.calculator.AverageCalculator;

public class ListComparator implements Comparator {

    private final AverageCalculator firstListCalculator;
    private final AverageCalculator secondListCalculator;

    public ListComparator(final AverageCalculator inFirstListCalculator, final AverageCalculator inSecondListCalculator) {
        if (inFirstListCalculator == null || inSecondListCalculator == null) {
            throw new IllegalArgumentException("Значения списков не могут быть нулевыми");
        }
        this.firstListCalculator = inFirstListCalculator;
        this.secondListCalculator = inSecondListCalculator;

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

