package org.example;

import org.example.calculator.AverageCalculator;
import org.example.calculator.DoubleListAverageCalculator;
import org.example.calculator.ListAverageCalculator;
import org.example.comparator.Comparator;
import org.example.comparator.ListComparator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> firstList = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> secondList = Arrays.asList(2.0, 3.0, 4.0, 5.0, 6.0);

        AverageCalculator firstListCalculator = new ListAverageCalculator<>(firstList);
        AverageCalculator secondListCalculator = new DoubleListAverageCalculator(secondList);

        Comparator listComparator = new ListComparator(firstListCalculator, secondListCalculator);
        System.out.println(listComparator.compare());


    }
}