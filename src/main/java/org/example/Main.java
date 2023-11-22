package org.example;

import org.example.calculator.AverageCalculator;
import org.example.calculator.DoubleListAverageCalculator;
import org.example.calculator.ListAverageCalculator;
import org.example.comparator.Comparator;
import org.example.comparator.ListComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        //
        //        List<Integer> firstList = Arrays.asList(1, 2, 3, 4, 5);
        //        List<Double> secondList = Arrays.asList(2.0, 3.0, 4.0, 5.0, 6.0);
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = new ArrayList<>();
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.println("Введите целые числа для первого списка через пробел: ");
            String input = scanner.nextLine();
            String[] firstListStrings = input.split("\\s+");
            for (String s : firstListStrings) {
                try {
                    firstList.add(Integer.parseInt(s));
                    isValidInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Одно или несколько значений не являются целыми числами, попробуйте еще раз");
                    firstList.clear();
                    break;
                }
            }
        }

        List<Double> secondList = new ArrayList<>();
        isValidInput = false;

        while (!isValidInput) {
            System.out.println("Введите числа с плавающей точкой для второго списка через пробел: ");
            String input = scanner.nextLine();
            String[] secondListStrings = input.split("\\s+");
            for (String s : secondListStrings) {
                try {
                    secondList.add(Double.parseDouble(s));
                    isValidInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Одно или несколько значений не являются числами с плавающей точкой, попробуйте еще раз");
                    secondList.clear();
                    break;
                }
            }
        }


        AverageCalculator firstListCalculator = new ListAverageCalculator<>(firstList);
        AverageCalculator secondListCalculator = new DoubleListAverageCalculator(secondList);

        Comparator listComparator = new ListComparator(firstListCalculator, secondListCalculator);
        System.out.println(listComparator.compare());


    }
}

