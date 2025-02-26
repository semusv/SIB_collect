package tasks.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TaskCollections {
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
        if (destination.size() < source.size()) {
            throw new IndexOutOfBoundsException("Source does not fit in dest");
        }
        for (int i = 0; i < source.size(); i++) {
            destination.set(i, source.get(i));
        }
    }

    private static void addAll(ArrayList<String> list, String... strings) {
        for (String string : strings) {
            list.add(string);
        }
    }

    private static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            if (string.equals(oldValue)) {
                list.set(i, newValue);
            }
        }
    }

    private static void reverse(ArrayList<Integer> list) {
        for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++) {
            Integer integer = list.get(i);
            list.set(i, list.get(j - i));
            list.set(j - i, integer);
        }
    }

    private static void sort(ArrayList<Integer> list) {
        int n = list.size();
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (list.get(j - 1) > list.get(j)) {
                    temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    private static void rotate(ArrayList<Integer> list, int distance) {
        for (int i = 0; i < distance; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
    }

    private static void shuffle(ArrayList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < list.size(); i++) {
            int randomIndexToSwap = rand.nextInt(list.size());
            int temp = list.get(randomIndexToSwap);
            list.set(randomIndexToSwap, list.get(i));
            list.set(i, temp);
        }
    }

    private static Integer min(ArrayList<Integer> list) {
        Integer minimum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minimum) {
                minimum = list.get(i);
            }
        }
        return minimum;
    }

    private static Integer max(ArrayList<Integer> list) {
        Integer maximum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        return maximum;
    }

    private static int frequency(ArrayList<Integer> list, Integer element) {
        int frequency = 0;
        if (element == null) {
            return frequency;
        } else {
            for (Integer integer : list) {
                if (element.equals(integer)) {
                    frequency++;
                }
            }
        }
        return frequency;
    }

    private static int binarySearch(ArrayList<Integer> list, Integer key) {
        int low = 0;
        int high = list.size() - 1;
        int mid = (low + high) / 2;
        int index = -1;
        while (low <= high) {
            if (list.get(mid) < key) {
                low = mid + 1;
            } else if (list.get(mid).equals(key)) {
                index = mid;

                while(true) {
                    if (list.get(index-1).equals(key))
                        index--;
                    else
                        break;
                }
                break;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return index;
    }
}
