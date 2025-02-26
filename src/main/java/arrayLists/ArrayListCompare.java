package arrayLists;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListCompare {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ABAP");
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Go");

        // Сортировка по длине строки
        list.sort(Comparator.comparingInt(String::length));
        System.out.println("Отсортированный список: " + list);

        // Сортировка по первой букве
        list.sort(new ComparatorByFirstLetter() );
        System.out.println("Отсортированный список: " + list);

        //Сортировка по второй букве
        Comparator<String> comporatorBySecond =
                new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(1) - o2.charAt(1);
            }
        };
        list.sort(comporatorBySecond );
        System.out.println("Отсортированный список: " + list);

    }
}

class ComparatorByFirstLetter implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.charAt(0) - o2.charAt(0);
    }
}
