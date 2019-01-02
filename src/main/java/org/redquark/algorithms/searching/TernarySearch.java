package org.redquark.algorithms.searching;

public class TernarySearch {

    /**
     * Method that will search the key inside an array
     */
    public <T extends Comparable<T>> int search(T[] arr, T key, int low, int high) {

        // Check if low index is less than or equal to high
        if (low <= high) {

            // We have to calculate two mid values which will divide the array in three parts
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            // Check if the key is equal to the element at mid1 index of the array
            if (key.compareTo(arr[mid1]) == 0) {
                return mid1;
            }

            // Check if the key is equal to the element at mid2 index of the array
            if (key.compareTo(arr[mid2]) == 0) {
                return mid2;
            }

            // Check in which portion of the array the key lies - Recursive approach
            if (key.compareTo(arr[mid1]) < 0) {
                return search(arr, key, low, mid1 - 1);
            } else if (key.compareTo(arr[mid2]) > 0) {
                return search(arr, key, mid2 + 1, high);
            } else {
                return search(arr, key, mid1 + 1, mid2 - 1);
            }
        }

        // Key is not found in the array
        return -1;
    }
}
