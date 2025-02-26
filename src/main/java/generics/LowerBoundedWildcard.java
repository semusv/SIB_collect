package generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        addNumbers(numbers); // Работает, так как Number super Integer
        addNumbers(objects); // Работает, так как Object super Integer
    }
    static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
    }
}
