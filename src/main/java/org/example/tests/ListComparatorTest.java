package org.example.tests;

import org.example.calculator.ListAverageCalculator;
import org.example.comparator.ListComparator;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListComparatorTest {
    @Test
    public void testCompareFirstLarger() {
        List<Integer> firstList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> secondList = Arrays.asList(2, 3, 4, 5, 6);

        ListAverageCalculator firstListCalculator = new ListAverageCalculator(firstList);
        ListAverageCalculator secondListCalculator = new ListAverageCalculator(secondList);

        ListComparator listComparator = new ListComparator(firstListCalculator, secondListCalculator);

        assertEquals("Первый список имеет большее среднее значение", listComparator.compare());
    }

    @Test
    public void testCompareSecondLarger() {
        List<Integer> firstList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> secondList = Arrays.asList(2, 3, 4, 5, 6);

        ListAverageCalculator firstListCalculator = new ListAverageCalculator(firstList);
        ListAverageCalculator secondListCalculator = new ListAverageCalculator(secondList);

        ListComparator listComparator = new ListComparator(firstListCalculator, secondListCalculator);

        assertEquals("Второй список имеет большее среднее значение", listComparator.compare());
    }

    @Test
    public void testCompareEqualAverages() {
        List<Integer> firstList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> secondList = Arrays.asList(2, 3, 4, 5, 6);

        ListAverageCalculator firstListCalculator = new ListAverageCalculator(firstList);
        ListAverageCalculator secondListCalculator = new ListAverageCalculator(secondList);

        ListComparator listComparator = new ListComparator(firstListCalculator, secondListCalculator);

        assertEquals("Средние значения равны", listComparator.compare());
    }
}
