package org.example.tests;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 * Класс TestRunner содержит метод main, который запускает набор тестов логики приложения.
 * Результаты тестов выводятся в консоль.
 *
 * @author Ivan
 */

public class TestRunner {
    /** Метод запускает набор тестов для проверки логики приложения.
     * @param args не принимает никаких аргументов из командной строки.
     */
    @SuppressWarnings("checkstyle:hideutilityclassconstructor")
    public static void main(final String[] args) {
        Result result = JUnitCore.runClasses(ListAverageCalculatorTest.class, DoubleListAverageCalculatorTest.class, ListComparatorTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println("\u2757 Тест не пройден: " + failure + "\n");
        }

        System.out.println((result.wasSuccessful()) ? "Тесты пройдены успешно \u2705" : "\u274c Тесты провалены \u2191");
    }
}

