package org.example.calculator;

import java.util.List;

public class DoubleListAverageCalculator extends ListAverageCalculator {
    public DoubleListAverageCalculator(List<Double> numbers) {

        super(numbers);
    }

    @Override
    public double calculateAverage() {
        return numbers.stream().mapToDouble(val -> (double) val).average().orElse(0.0);
    }
}

