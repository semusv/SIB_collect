package arrayLists;

import java.util.ArrayList;
import java.util.List;

/**
 * 4) Пример показывает как можно искать элементы в LIST
 */
public class ArrayListSearch {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        String searchItem = "Cherry";
        int index = fruits.indexOf(searchItem);
        if (index != -1) {
            System.out.println("Элемент '" + searchItem + "' найден на позиции: " + index);
        } else {
            System.out.println("Элемент '" + searchItem + "' не найден.");
        }
    }
}
