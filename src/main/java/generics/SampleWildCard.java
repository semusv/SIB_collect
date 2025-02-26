package generics;

import java.util.ArrayList;
import java.util.List;

public class SampleWildCard {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 10, 5);
        List<Number> numbers = new ArrayList<>();

        System.out.println("Copy-----------------");
        copy(integers, numbers); // Копируем Integer в List<Number>
        System.out.println(numbers); // [1, 2, 3]

        System.out.println("Max-----------------");
        System.out.println(max(integers)); // 5

    }

    static void copy(List<? extends Number> src, List<? super Number> dest) {
        //наследник от Number в качестве источника
        //родитель в качестве назначения
        for (Number number : src) { //Можем брать из стоника T
            dest.add(number); //Можем добавить в назначение T
        }

    }


    //Параметризованный метод
    static <T extends Comparable<? super T>> T max(List<? extends T> list) {
        //<T extends Comparable<? super T>> - означает что тип возвращаемого результата
        // должен реализовывать интерфейс Comparable
        //При этом Comparable может быть параметризован как самим типом T,
        // так и любым его супертипом (? super T).
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) { //Метод сравнивающий значения с MAX
                max = item;
            }
        }
        return max;
    }


}


