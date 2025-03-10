package hashSet;

import java.util.HashSet;

/**
 * 4) Пример показывает как можно объединить множества без дубликатов
 */
public class unionSets {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");

        HashSet<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("orange");

        // Объединяем множества
        HashSet<String> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("Объединение множеств: " + union);
    }
}
