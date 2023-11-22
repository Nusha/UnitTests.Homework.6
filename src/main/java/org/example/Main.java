package org.example;

import org.example.calculator.AverageCalculator;
import org.example.calculator.DoubleListAverageCalculator;
import org.example.calculator.ListAverageCalculator;
import org.example.comparator.Comparator;
import org.example.comparator.ListComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Это основной класс программы калькулятора, который использует различные классы и интерфейсы из пакетов calculator и comparator.
 * Он содержит метод main(), который выполняет основную логику программы:
 * 1. Получает два списка чисел от пользователя через консольный ввод (Integer и Double), проверяет на соответствие типам.
 * 2. Создает экземпляры классов ListAverageCalculator и DoubleListAverageCalculator для расчета среднего значения каждого списка.
 * 3. Создает экземпляр класса ListComparator для сравнения средних значений двух списков.
 * 4. Выводит результат сравнения на консоль.
 */
public class Main {
    /** Основной метод.
     * @param args не принимает никакие параметры.
     */
    public static void main(final String[] args) {

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

