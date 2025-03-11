package arrayLists;

import java.util.ArrayList;
import java.util.List;

/**1) Пример показывет как создавать ArrayList
 * 2) Пример показывает базовые действия над ArrayList
 */
public class ArraListDemo {
    public static void main(String[] args) {
//        ArraylistCreate.run();
        ArrayListBaseActions.run();
    }
}

class ArraylistCreate {
    public static void run(){
        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Double> list3 = new ArrayList<>();

        System.out.println( list1.getClass() );
        System.out.println( list2.getClass() );
        System.out.println( list3.getClass() );
    }
}


class ArrayListBaseActions {
    public static void run() {
        List<String> list = new ArrayList<>();
        list.add("a");		//Добавление в конец
        list.add("b");
        list.add("c");
        list.add(1,"Z");	//Добавление по номеру индекса
        list.remove(2);		//Удаление по номеру индекса

        System.out.println(list);
        System.out.println("Элемент под номером 1: " + list.get(0));
        System.out.println("Количество элементов: " + list.size() + '\n');

        System.out.println("Вывод в обратном порядке");
        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
    }
}