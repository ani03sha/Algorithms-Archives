package org.redquark.algorithms.searching;

/**
 * @author Anirudh Sharma
 */
public class BinarySearch {

    /**
     * Method that will search the key inside an array
     */
    public <T extends Comparable<T>> int search(T[] arr, T key, int low, int high) {

        // Loop until the low is less or equal to high
        while (low <= high) {

            // Calculating the mid
            int mid = (low + high) / 2;

            // Case when the key is present in the left half of the array
            if (key.compareTo(arr[mid]) < 0) {

                // updating the value of high
                high = mid - 1;
            }

            // Case when the key is present in the right half of the array
            if (key.compareTo(arr[mid]) > 0) {

                // Updating the value of low
                low = mid + 1;
            }


            // When the key is found
            if (key == arr[mid]) {

                // Return the index
                return mid;
            }
        }

        // Key is not found in the array
        return -1;
    }
}
