package iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorBase {
    public static void main(String[] args) {
        Collection<String> set = new HashSet<String>();

        set.add("Привет");
        set.add("Hello");
        set.add("Hola");
        set.add("Bonjour");
        set.add("Ciao");
        set.add("Namaste");

        //ConcurrentModificationException выбрасывается тогда, когда вы пытаетесь вставлять или удалять из коллекции
        // элементы во время перебора элементов этой коллекции. Это потенциально может привести к некорректному
        // поведению итератора (возвращению неверного следующего элемента или некорректному результату метода hasNext()),
        // поэтому все стандартные коллекции предпочитают сразу пресечь подобное поведение.
//        for( String s : set){
//            set.remove(s);
//        }


        Iterator<String> it = set.iterator();
        //удаление через итератор
        while (it.hasNext()) {
            String str = it.next();
            if (str.equals("Hola")){
                it.remove();
            }
            System.out.println(str);
        }

        System.out.println(set);
    }
}
