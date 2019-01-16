package org.redquark.algorithms.sorting;

public class BogoSort {

    public <T extends Comparable<T>> T[] sort(T[] arr) {

        while (!isSorted(arr)) {
            shuffle(arr);
        }

        return arr;
    }

    private <T extends Comparable<T>> void shuffle(T[] arr) {

        for (int i = 1; i < arr.length; i++) {
            swap(arr, i, (int) (Math.random() * i));
        }
    }

    private <T extends Comparable<T>> void swap(T[] arr, int i, int j) {

        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private <T extends Comparable<T>> boolean isSorted(T[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }
}
