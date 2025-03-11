package linkedList;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 2) Пример LinkedList можно использовать для реализации стека (последний пришел, первый ушел).
 * Интерфейс Deque расширяет вышеописанный интерфейс Queue и определяет поведение двунаправленной очереди,
 * которая работает как обычная однонаправленная очередь, либо как стек, действующий по принципу LIFO (последний вошел - первый вышел).
 */
public class Lifo {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        // Добавляем элементы в стек
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        // Извлекаем элементы из стека
        System.out.println(stack);
        System.out.println(stack.pop()); // Third
        System.out.println(stack);
        System.out.println(stack.pop()); // Second
        System.out.println(stack);
        System.out.println(stack.pop()); // First
        System.out.println(stack);




    }
}
