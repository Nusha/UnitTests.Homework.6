package org.example.calculator;

import java.util.List;

public class ListAverageCalculator<T extends Number> implements AverageCalculator {
    protected List<T> numbers;

    public ListAverageCalculator(final List<T> inNumbers) {
        this.numbers = inNumbers;
    }

    public double calculateAverage() {
        return numbers.stream().mapToInt(val -> (int) val).average().orElse(0.0);
    }

}
