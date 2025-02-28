package hashMap;

import java.util.HashMap;
import java.util.Map;


/**
 * 1) Пример показывает базовые методы работы с HashTable
 */
public class HashMapBase {

    HashMap<String, Integer> map;
    HashMap<String, Integer> map1;
    HashMap<String, Integer> map2;
    HashMap<String, Integer> map3;
    HashMap<Integer, Integer> map4;

    public static void main(String[] args) {
        HashMapBase hashMapBase = new HashMapBase();
        hashMapBase.constructors();
        hashMapBase.loopElements();
        hashMapBase.print();
    }

    public void constructors() {
        map = new HashMap<>();
        map1 = new HashMap<>(8);   //InitCapacity должно быть степенью двойки
        map2 = new HashMap<>(16, 0.5f);
        map3 = new HashMap<>(map);

        map1.put("a", 1);
        map1.put("a", 999);
        map1.put("b", 2);
        map1.put("c", 3);
        map1.put("d", 4);
        map1.put("e", 5);
        map1.put("f", 6);
        map1.put("g", 7);
        map1.put("h", 8);
        map1.put("i", 9);
        map1.put("j", 10);
        map1.put("k", 11);
        map1.put("l", 12);
        map1.put("m", 13);
        map1.put("n", 14);
        map1.put("o", 15);

    }

    public void loopElements() {
        //Бежим по ключам
        System.out.println("\nKeys");
        for (String key : map1.keySet()) {
            System.out.println(key);
        }

        //Бежим по значениям
        System.out.println("\nValues");
        for (Integer value : map1.values()) {
            System.out.println(value);
        }

        //Бежим по Entry парам
        System.out.println("\nEntries");
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.printf("Key: %s  Value: %d \n", key, value);
        }
    }

    public void print(){
        System.out.println("\nGet values by key");
        System.out.println(map1.get("a"));
    }
}
