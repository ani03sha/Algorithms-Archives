package org.redquark.algorithms.searching;

/**
 * @author Anirudh Sharma
 * <p>
 * Jump Search is a searching algorithms for sorted arrays.
 * <p>
 * The basic idea is to check fewer elements (than linear search)
 * by jumping ahead by fixed steps or skipping some elements in
 * place of searching all elements.
 */
public class JumpSearch {

    /**
     * This method searches the array for a given key
     */
    public <T extends Comparable<T>> int search(T[] arr, T key) {

        // Length of the array
        int n = arr.length;

        // Block size
        int blockSize = (int) Math.sqrt(n);

        // This loop will find out the interval in which the key lies
        for (int i = blockSize; i <= n; i = i + blockSize - 1) {

            // If key is less than or equal to the current element of the array,
            // Then we have found the interval which is from (i-blockSize) to i
            if (key.compareTo(arr[i - 1]) <= 0) {

                // Perform linear search in the interval
                for (int j = i - blockSize; j <= i; j++) {
                    if (key.compareTo(arr[j]) == 0) {

                        // Returning the index where the element is found
                        return j;
                    }
                }
            }
        }

        // Key is not found in the array
        return -1;
    }
}
