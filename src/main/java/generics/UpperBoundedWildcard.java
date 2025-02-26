package generics;

import java.util.List;

public class UpperBoundedWildcard {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.1, 2.2, 3.3);

        printNumbers(integers); // Работает, так как Integer extends Number
        printNumbers(doubles);  // Работает, так как Double extends Number
    }

    static void printNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }
}
