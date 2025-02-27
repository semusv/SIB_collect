package generics;

import java.util.List;
/**
 * 2) Пример показывает верхнюю границу WildCard
 */
public class UpperBoundedWildcard {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.1, 2.2, 3.3);

        printNumbers(integers); // Работает, так как Integer extends Number
        printNumbers(doubles);  // Работает, так как Double extends Number

        Number  number = 1L;
        Integer integer = 2;
        printNumber(number);
        printNumber(integer);
    }

    static void printNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    static <T extends Number> void printNumber( T param ){
        System.out.println(param.getClass());
    }
}
