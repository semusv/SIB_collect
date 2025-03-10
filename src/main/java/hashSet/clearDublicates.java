package hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/**
 * 1) Пример показывает как можно избавить от дубликатов в списке
 */
public class clearDublicates {
    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("apple");
        listWithDuplicates.add("banana");
        listWithDuplicates.add("apple");
        listWithDuplicates.add("orange");

        // Удаляем дубликаты с помощью HashSet
        HashSet<String> set = new HashSet<>(listWithDuplicates);

        System.out.println("Список без дубликатов: " + set);
    }
}
