package arrayLists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 6) Пример демонстрирует как преобразовывать массив в лист и обратно
 */
public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Преобразование в массив
        String[] array = list.toArray(new String[0]);
        System.out.println("Массив: ");
        System.out.println(Arrays.toString(array));


        //Преобразование в LIST
        List<String> list2 = new ArrayList<>();
        list2 = Arrays.asList(array);
        System.out.println("List: ");
        System.out.println(list2);

    }
}
