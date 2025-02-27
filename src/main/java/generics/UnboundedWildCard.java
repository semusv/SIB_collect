package generics;


import java.util.Collection;
import java.util.List;

/**
 * 4) Пример показывает Неограниченный WildCard
 */
public class UnboundedWildCard {
    public static void main(String[] args) {

        List<String> strings = List.of("A", "B", "C");
        List<Integer> numbers = List.of(1, 2, 3, 4);

        printList(strings); // Работает с List<String>
        printList(numbers); // Работает с List<Integer>

        processCollection(strings); // Работает с Collection<String>
        processCollection(numbers); // Работает с Collection<Integer>
    }

    //Может быть полезно когда мы работаем просто с Листом непонятного типа
    static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
    //или когда работаем с коллекцией непонятного типа
    static void processCollection(Collection<?> collection) {
        System.out.println("Количество элементов: " + collection.size());
    }
}
