package hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 4) Пример показывает как можно искать дубликаты в массиве
 */
public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 3, 6, 2};

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        System.out.println("Дубликаты:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " раза");
            }
        }
        // Вывод: Дубликаты: 2, 3
    }
}