package org.redquark.algorithms.searching;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * The idea is to start with subarray size 1, compare its last element with x, then try size 2,
 * then 4 and so on until last element of a subarray is not greater.
 * <p>
 * Once we find an index i (after repeated doubling of i), we know that the element must be present
 * between i/2 and i (Why i/2? because we could not find a greater value in previous iteration)
 */
public class ExponentialSearch {

    /**
     * This method searches the key in the passed array
     */
    public <T extends Comparable<T>> int search(T[] arr, T key) {

        // Base condition
        if (arr[0].compareTo(key) == 0) {
            return 0;
        }

        // Length of the arrayi
        int n = arr.length;

        // This index will be doubled each time if the element is not found
        int index = 1;

        while (index < n && key.compareTo(arr[index]) >= 0) {
            index = index * 2;
        }

        // Perform binary search for elements between index/2 and index
        return Arrays.binarySearch(arr, index / 2, Math.min(index, n), key);
    }
}
