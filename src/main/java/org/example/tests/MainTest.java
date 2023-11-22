package org.example.tests;

import org.example.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Класс MainTest содержит тесты для проверки ввода списков чисел.
 *
 * @author Ivan
 */
public class MainTest {
    /**
     * ByteArrayOutputStream, используемый для перехвата стандартного вывода.
     * Этот поток используется для проверки вывода программы в тестах.
     */
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    /**
     * Метод setUpStreams устанавливает поток вывода перед каждым тестом.
     */
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    /**
     * Метод testListsInput проверяет, что программа корректно обрабатывает ввод списков чисел из
     * консоли.
     */
    @Test
    public void testListsInput() {

        String input = "1 2 3 4 5\r\n2.0 3.0 4.0 5.0 6.0\r\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{});
        String expectedOutput = "Введите целые числа для первого списка через пробел: " + "\r\n"
                + "Введите числа с плавающей точкой для второго списка через пробел: " + "\r\n"
                + "Второй список имеет большее среднее значение" + "\r\n";
        assertEquals(expectedOutput, outContent.toString());

    }

    /**
     * Метод restoreStreams восстанавливает стандартные потоки ввода и вывода после каждого теста.
     */
    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setIn(System.in);
    }


}
