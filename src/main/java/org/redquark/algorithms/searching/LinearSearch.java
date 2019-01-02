package org.redquark.algorithms.searching;

/**
 * @author Anirudh Sharma
 */
public class LinearSearch {

    /**
     * Method that will search the key inside an array
     */
    <T extends Comparable<T>> int search(T[] arr, T key) {

        // Loop until the key is not found
        for (int i = 0; i < arr.length; i++) {

            // If the current element is equal to the key
            if (key.compareTo(arr[i]) == 0) {
                return i;
            }
        }

        // Key is not found in the entire array
        return -1;
    }
}
