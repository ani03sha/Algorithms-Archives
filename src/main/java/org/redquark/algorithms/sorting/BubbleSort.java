package org.redquark.algorithms.sorting;

/**
 * @author Anirudh Sharma
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping
 * the adjacent elements if they are in wrong order.
 */

public class BubbleSort {

    /**
     * Method to sort the array
     */
    public <T extends Comparable<T>> T[] sort(T[] arr) {

        // Length of the array
        int length = arr.length;

        // Outer loop is for each pass
        for (int i = 0; i < length - 1; i++) {
            // Inner loop compares the adjacent elements and swap them if they are in the wrong order
            // (length - i - 1) is for comparing elements which already have been compared in the previous iterations
            for (int j = 0; j < length - i - 1; j++) {
                // If the elements are in the wrong order...
                if (arr[j + 1].compareTo(arr[j]) < 0) {
                    // ... then swap them
                    T temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    /**
     * Method to sort the array in optimal way - We stop the comparisons when we find that
     * no swap has taken place in an iteration
     */
    public <T extends Comparable<T>> T[] optimizedSort(T[] arr) {

        // Length of the array
        int length = arr.length;

        // Flag to indicate if the inner loop caused any swap
        boolean flag;
        // Outer loop is for each pass
        for (int i = 0; i < length - 1; i++) {
            // Initializing the flag
            flag = false;
            // Inner loop compares the adjacent elements and swap them if they are in the wrong order
            // (length - i - 1) is for comparing elements which already have been compared in the previous iterations
            for (int j = 0; j < length - i - 1; j++) {
                // If the elements are in the wrong order...
                if (arr[j + 1].compareTo(arr[j]) < 0) {
                    // ... then swap them
                    T temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    // Since the swap occurred we should set the flag
                    flag = true;
                }
            }
            // If the flag is not set then it means there was no swap, so we can stop the comparison
            if (!flag) {
                break;
            }
        }

        return arr;
    }
}
