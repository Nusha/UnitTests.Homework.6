package org.example.tests;

import org.example.calculator.ListAverageCalculator;
import org.example.comparator.ListComparator;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Класс ListComparatorTest содержит тесты для класса ListComparator.
 *
 * @author Ivan
 */
public class ListComparatorTest {
    /**
     * Тест проверяет, что первый список имеет большее среднее значение.
     */
    //CHECKSTYLE:OFF: checkstyle:magicnumber
    @Test
    public void testCompareFirstLarger() {
        @SuppressWarnings("checkstyle:magicnumber")
        List<Integer> firstList = Arrays.asList(10, 2, 3, 4, 5);
        List<Integer> secondList = Arrays.asList(2, 3, 4, 5, 6);

        ListAverageCalculator firstListCalculator = new ListAverageCalculator(firstList);
        ListAverageCalculator secondListCalculator = new ListAverageCalculator(secondList);

        ListComparator listComparator = new ListComparator(firstListCalculator, secondListCalculator);

        assertEquals("Первый список имеет большее среднее значение", listComparator.compare());
    }
    /**
     * Тест проверяет, что второй список имеет большее среднее значение.
     */
    @Test
    public void testCompareSecondLarger() {
        @SuppressWarnings("checkstyle:magicnumber")
        List<Integer> firstList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> secondList = Arrays.asList(2, 3, 4, 5, 6);

        ListAverageCalculator firstListCalculator = new ListAverageCalculator(firstList);
        ListAverageCalculator secondListCalculator = new ListAverageCalculator(secondList);

        ListComparator listComparator = new ListComparator(firstListCalculator, secondListCalculator);

        assertEquals("Второй список имеет большее среднее значение", listComparator.compare());
    }
    /**
     * Тест проверяет, что средние значения двух списков равны.
     */
    @Test
    public void testCompareEqualAverages() {
        @SuppressWarnings("checkstyle:magicnumber")
        List<Integer> firstList = Arrays.asList(6, 2, 3, 4, 5);
        List<Integer> secondList = Arrays.asList(2, 3, 4, 5, 6);

        ListAverageCalculator firstListCalculator = new ListAverageCalculator(firstList);
        ListAverageCalculator secondListCalculator = new ListAverageCalculator(secondList);

        ListComparator listComparator = new ListComparator(firstListCalculator, secondListCalculator);

        assertEquals("Средние значения равны", listComparator.compare());
    }
    //CHECKSTYLE:ON: checkstyle:magicnumber
}
