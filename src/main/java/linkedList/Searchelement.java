package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 4) LinkedList поддерживает поиск элементов по индексу или значению.
 */
public class Searchelement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Поиск по индексу
        System.out.println("Элемент по индексу 1: " + list.get(1));

        // Поиск индекса по значению
        System.out.println("Индекс элемента 'Banana': " + list.indexOf("Banana"));
    }
}
