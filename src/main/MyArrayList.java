package main;
import java.util.NoSuchElementException;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void add(String s) {
        array[size] = s;
        size++;
        if (size == array.length) {
            increase();
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } else throw new IndexOutOfBoundsException();
    }

    public void remove(String text) {
        int index = getIndex(text);
        if (index >= 0) {
            remove(index);
        } else {
            throw new NoSuchElementException();
//            System.out.println(" --- Element not found --- ");
        }
    }

    public String get(int index) {
        if (index < size && index >= 0) {
            return array[index];
        } else throw new IndexOutOfBoundsException();
    }

    private void increase() {
        String[] newArray = new String[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    private int getIndex(String text) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(text)) {
                return i;
            }
        }
        return -1;
    }
}
