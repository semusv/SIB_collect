package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;
/**
 * 3) Примеры итераций в LinkedList
 */

public class IterationExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Итерация с помощью for-each
        System.out.println("Итерация с помощью for-each:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Итерация с помощью ListIterator
        System.out.println("Итерация с помощью ListIterator:");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
