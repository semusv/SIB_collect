package tasks.task3;

import java.util.Arrays;

public class TaskCustomArrayList {
    public static void main(String[] args) {
        CustomStringArrayList list = new CustomStringArrayList();

        list.add("a01");
        list.add("a02");
        list.add("a03");
        list.add("a04");
        list.add("a05");
        list.add("a06");
        list.add("a07");
        list.add("a08");
        list.add("a09");
        list.add("a10");
        list.add("a11");
        list.add("a12");
        System.out.println(list.toString());
    }
}

class CustomStringArrayList {
    private String[] elements;
    private int size ;
    private int capacity ;

    public CustomStringArrayList() {

    }

    public void add(String str) {

    }

    @SuppressWarnings("unused")
    private void grow() {

    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "CustomStringArrayList [elements=" + Arrays.toString(elements) + ", size=" + size + ", capacity="
                + capacity + "]";
    }
}

/*
class CustomStringArrayList {
	private String[] elements;
	private int size = 0;
	private int capacity = 10;

	public CustomStringArrayList() {
		elements = new String[capacity];
	}

	public void add(String str) {
		if (size == capacity)
			grow();
		elements[size++] = str;
	}

	private void grow() {
		capacity = capacity + capacity / 2;
		String[] newElements = new String[capacity];

		for (int i = 0; i < elements.length; i++) {
			newElements[i] = elements[i];
		}
		elements = newElements;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "CustomStringArrayList [elements=" + Arrays.toString(elements) + ", size=" + size + ", capacity="
				+ capacity + "]";
	}
}
*/
