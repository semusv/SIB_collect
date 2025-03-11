package linkedList;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 1) LinkedList также можно использовать для реализации очереди (первый пришел, первый ушел).
 * Обобщенный интерфейс Queue<E> расширяет базовый интерфейс Collection и определяет поведение класса в качестве однонаправленной очереди.
 * Свою функциональность он раскрывает через следующие методы:
 */
public class Fifo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Добавляем элементы в очередь
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        // Извлекаем элементы из очереди
        System.out.println(queue);
        System.out.println(queue.poll()); // First
        System.out.println(queue);
        System.out.println(queue.poll()); // Second
        System.out.println(queue);
        System.out.println(queue.poll()); // Third
        System.out.println(queue);
    }
}
