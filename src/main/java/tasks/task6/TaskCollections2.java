package tasks.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TaskCollections2 {
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(15, 2, 48, 7, 4, 26, 6,7, 47, 85, 9,7, 60));
        ArrayList<String> stringList1 = new ArrayList<>(Arrays.asList("str1", "str3", "str4"));
        ArrayList<String> stringList2 = new ArrayList<>(Arrays.asList("str8", "str5", "str6"));
        ArrayList<String> stringList3 = new ArrayList<>();

        System.out.println(intList);
        System.out.println(stringList1);
        System.out.println(stringList2);
        System.out.println(stringList3);
        System.out.println();

//copy
        System.out.println("\n--Copy");
        stringList3 = new ArrayList<String>(Collections.nCopies(stringList1.size(), (String) null));
        System.out.println(stringList3);
        copy(stringList3, stringList1);
        System.out.println(stringList3);

//addAll
        System.out.println("\n--addAll");
        addAll(stringList3, "qwe", "twertw");
        System.out.println(stringList3);

//replaceAll
        System.out.println("\n--replaceAll");
        replaceAll(stringList3, "qwe", "newString");
        System.out.println(stringList3);

//reverse
        System.out.println("\n--reverse");
        System.out.println(intList);
        reverse(intList);
        System.out.println(intList);

//sort
        System.out.println("\n--sort");
        System.out.println(intList);
        sort(intList);
        System.out.println(intList);

//rotate
        System.out.println("\n--rotate");
        System.out.println(intList);
        rotate(intList, 4);
        System.out.println(intList);

//shuffle
        System.out.println("\n--shuffle");
        System.out.println(intList);
        shuffle(intList);
        System.out.println(intList);

//min
        System.out.println("\n--min");
        System.out.println(intList);
        System.out.println(min(intList));

//max
        System.out.println("\n--max");
        System.out.println(intList);
        System.out.println(max(intList));

//frequency
        System.out.println("\n--frequency");
        System.out.println(intList);
        System.out.println(frequency(intList, 7));

//binarySearch
        System.out.println("\n--binarySearch");
        sort(intList);
        System.out.println(intList);
        System.out.println( binarySearch(intList, 7));
    }


    private static void copy(ArrayList<String> destination, ArrayList<String> source) {

    }

    private static void addAll(ArrayList<String> list, String... strings) {

    }

    private static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {

    }

    private static void reverse(ArrayList<Integer> list) {

    }

    private static void sort(ArrayList<Integer> list) {

    }

    private static void rotate(ArrayList<Integer> list, int distance) {

    }

    private static void shuffle(ArrayList<Integer> list) {

    }

    private static Integer min(ArrayList<Integer> list) {
        return null;
    }

    private static Integer max(ArrayList<Integer> list) {
        return null;
    }

    private static int frequency(ArrayList<Integer> list, Integer element) {
        return 0;
    }

    private static int binarySearch(ArrayList<Integer> list, Integer key) {
        return 0;
    }

}
