package hashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 1) Пример показывает базовые методы работы с HashSet
 */
public class HashSetBase {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Привет");
        set.add("Hello");
        set.add("Hola");
        set.add("Bonjour");
        set.add("Ciao");
        set.add("Namaste");

        System.out.println(set);

        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        if (set.contains(str))
            System.out.println("Оно тут есть");
        else
            System.out.println("Такого нет");
        console.close();
    }
}
