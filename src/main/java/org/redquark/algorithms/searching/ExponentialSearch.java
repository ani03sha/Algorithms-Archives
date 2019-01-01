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

    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};

        // Element to be searched
        int key = 5;

        int result = search(arr, key);

        if (result != -1) {
            System.out.println("Element: " + key + " is found at index: " + result);
        } else {
            System.out.println("Element is not present in the array");
        }
    }

    private static int search(int[] arr, int key) {

        // Base condition
        if (arr[0] == key) {
            return 0;
        }

        // Length of the arrayi
        int n = arr.length;

        // This index will be doubled each time if the element is not found
        int index = 1;

        while (index < n && key >= arr[index]) {
            index = index * 2;
        }

        // Perform binary search for elements between index/2 and index
        return Arrays.binarySearch(arr, index / 2, Math.min(index, n), key);
    }
}
