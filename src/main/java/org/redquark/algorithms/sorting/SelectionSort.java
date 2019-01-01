package org.redquark.algorithms.sorting;

/**
 * @author Anirudh Sharma
 * <p>
 * The Selection sort algorithms is based on the idea of finding the minimum or maximum element in an unsorted array
 * and then putting it in its correct position in a sorted array.
 */

public class SelectionSort {

    /**
     * This method sorts the array
     */
    public <T extends Comparable<T>> T[] sort(T[] arr) {

        // Length of the array
        int length = arr.length;

        // Outer loop is for each pass
        for (int i = 0; i < length; i++) {

            // Assuming that the first element of unsorted array is the minimum
            T min = arr[i];

            // Inner loop that finds the minimum element in each iteration
            for (int j = i + 1; j < length; j++) {

                // If the current element is less than the minimum ...
                if (min.compareTo(arr[j]) > 0) {
                    // .. then we swap the current element and the minimum
                    T temp = min;
                    min = arr[j];
                    arr[j] = temp;
                }
            }
            // Since we have found the minimum value, we put it at its appropriate position
            arr[i] = min;
        }

        return arr;
    }
}
