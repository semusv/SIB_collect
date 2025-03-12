package hashSet;
import java.util.HashSet;
/**
 * 3) Пример показывает как можно найти пересечения
 */
public class findIntersection {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");

        HashSet<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("orange");
        set2.add("grape");
        set2.add("pear");

        // Создаем копию set1, чтобы не изменять оригинал
        HashSet<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // Оставляем только общие элементы

        System.out.println("Пересечение множеств: " + intersection);
    }
}
