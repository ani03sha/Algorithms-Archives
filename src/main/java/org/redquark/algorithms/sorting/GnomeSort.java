package org.redquark.algorithms.sorting;

public class GnomeSort {

    public <T extends Comparable<T>> T[] sort(T[] arr) {

        int index = 0;

        while (index < arr.length) {
            if (index == 0) {
                index++;
            }

            if (arr[index].compareTo(arr[index - 1]) >= 0) {
                index++;
            } else {
                T temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }

        }

        return arr;
    }
}
