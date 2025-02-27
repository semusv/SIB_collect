package arrayLists;

import java.util.ArrayList;
import java.util.List;
/**
 * 5) Пример показывает как можно искать подсписка
 */
public class ArrayListSublist {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
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
