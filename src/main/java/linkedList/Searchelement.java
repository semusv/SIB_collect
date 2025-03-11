package linkedList;

import java.util.LinkedList;
/**
 * 4) LinkedList поддерживает поиск элементов по индексу или значению.
 */
public class Searchelement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Поиск по индексу
        System.out.println("Элемент по индексу 1: " + list.get(1));

        // Поиск индекса по значению
        System.out.println("Индекс элемента 'Banana': " + list.indexOf("Banana"));
    }
}
