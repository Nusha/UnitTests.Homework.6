package org.example;
import org.example.calculator.*;
import org.example.comparator.*;

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