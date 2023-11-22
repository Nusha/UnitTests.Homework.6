package org.example.comparator;
/**
 * Этот интерфейс определяет метод для сравнения значений обобщенного типа T.
 *
 * @param <T> тип значений, которые будут сравниваться.
 */
public interface Comparator<T> {
    /**
     * Сравнивает два значения типа T.
     *
     * @return значение типа T, которое представляет результат сравнения.
     */
    T compare();
}
