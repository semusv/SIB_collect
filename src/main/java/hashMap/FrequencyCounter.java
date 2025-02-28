package hashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2) С помощью HashMap можно легко подсчитать, сколько раз каждый элемент встречается в списке.
 */
public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            //Получить значение из MAP или вернуть 0
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(frequencyMap);
        // Вывод: {orange=1, banana=2, apple=3}
    }
}
