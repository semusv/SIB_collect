package generics;


import java.util.List;

public class UnboundedWildCard {
    public static void main(String[] args) {

        List<String> strings = List.of("A", "B", "C");
        List<Integer> numbers = List.of(1, 2, 3);

        printList(strings); // Работает с List<String>
        printList(numbers); // Работает с List<Integer>
    }

    static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
