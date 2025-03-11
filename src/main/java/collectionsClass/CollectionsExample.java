package collectionsClass;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        BinarySearchExample.run();
        SortCollections.run();
        CollectionsCopyExample.run();
        CollectionsExample1.run();
        CollectionsFillExample.run();
        CollectionsFrequencyExample.run();
        CollectionsMinMaxExample.run();
        CollectionsRotateExample.run();
    }

}

    /**
     * sort(list) Сортирует список в порядке возрастания
     */
    class SortCollections {
        public static void run() {
            List<String> list = Arrays.asList("красный", "синий", "зеленый");
            System.out.println("Перед сортировкой: " + list);
            Collections.sort(list);
            System.out.println("После сортировки: " + list);
            Collections.sort(list, Collections.reverseOrder());
            System.out.println("После обратной сортировки: " + list);
        }
    }

    class BinarySearchExample {
        /**
         * binarySearch(list, key) Ищет элемент key в отсортированном списке, возвращает индекс.
         */
        public static void run() {
            List<String> list = Arrays.asList("красный", "синий", "зеленый");
            Collections.sort(list);

            System.out.println(list);
            System.out.println(Collections.binarySearch(list, "красный"));
            System.out.println(Collections.binarySearch(list, "черный"));
        }
    }

    class CollectionsExample1 {
        /**
         * reverse(list) Разворачивает список задом наперед .
         * shuffle(list) Случайно перемешивает элементы списка.
         *
         */
        public static void run() {
            List<String> list = Arrays.asList("красный", "синий", "зеленый", "черный");
            System.out.println("Перед reversing: " + list);
            Collections.reverse(list);
            System.out.println("После reversing: " + list);
            Collections.shuffle(list);
            System.out.println("После shuffling: " + list);
        }
    }

    class CollectionsFillExample {
        /**
         * fill(list, obj) Заменяет в переданном списке все элементы на obj
         *
         */
        public static void run() {
            List<String> list = Arrays.asList("красный", "синий", "зеленый");
            Collections.fill(list, "черный");
            System.out.println(list);
        }
    }

    class CollectionsMinMaxExample {
        /**
         * min(colls) Находит минимальный элемент коллекции colls
         * max(colls) Находит максимальный элемент коллекции colls
         *
         */
        public static void run() {
            List<Integer> list = Arrays.asList(2, 2, 5, 8, 9);
            System.out.println(Collections.max(list));
            System.out.println(Collections.min(list));
        }
    }

    class CollectionsCopyExample {
        /**
         * copy(dest, src) Копирует все элементы из списка src в список dest
         *
         */
        public static void run() {
            List<Integer> src = Arrays.asList(1, 2, 3);
            List<Integer> dest = Arrays.asList(4, 5, 6, 7);
            Collections.copy(dest, src);
            System.out.println(dest);
        }
    }

    class CollectionsRotateExample {
        /**
         * rotate(list, n) Циклично сдвигает элементы списка list на n элементов
         *
         */
        public static void run() {
            List<String> list = Arrays.asList("a", "b", "c", "d", "e");
            System.out.println(list);

            Collections.rotate(list, 2);
            System.out.println(list);

            Collections.rotate(list, -1);
            System.out.println(list);
        }
    }


    class CollectionsFrequencyExample {
        /**
         * frequency(colls, obj) Определяет, сколько раз элемент obj встречается в коллекции colls
         *
         */
        public static void run() {
            Collection<String> collection = Arrays.asList("red", "cyan", "red");
            System.out.println(Collections.frequency(collection, "red"));
        }
    }
