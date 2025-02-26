package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSublist {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Получение подсписка
        List<String> subList = list.subList(1, 4);

        System.out.println("Подсписок: " + subList);
    }
}
