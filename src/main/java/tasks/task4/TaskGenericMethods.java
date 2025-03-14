package tasks.task4;

import java.util.ArrayList;

public class TaskGenericMethods {
    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привет");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }
    public static void checkElementsType(ArrayList<Object> elements) {
        //напишите тут ваш код
    }

    public static void printString() {
        System.out.println("Строка");
    }

    public static void printInteger() {
        System.out.println("Целое число");
    }

    public static void printIntegerArray() {
        System.out.println("Массив целых чисел");
    }

    public static void printUnknown() {
        System.out.println("Другой тип данных");
    }
}

//public static void checkElementsType(ArrayList<Object> elements) {
//    for (int i = 0; i < elements.size(); i++) {
//        if (elements.get(i) instanceof String) {
//            printString();
//        } else if (elements.get(i) instanceof Integer) {
//            printInteger();
//        } else if (elements.get(i) instanceof Integer[]) {
//            printIntegerArray();
//        } else {
//            printUnknown();
//        }
//    }
//}