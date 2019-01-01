package org.redquark.algorithms.sorting;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Radix sort is used when elements range from 1 to n^2.
 */
public class RadixSort {

    private static void countSort(Integer[] arr, int exp) {

        // Creating the count array - This method will store the count of each element in the unsorted array
        // Its size should be 10 because we are dealing with 10 digits (0...9)
        int[] count = new int[10];

        Arrays.fill(count, 0);

        // This loop will store the count of each element in the array
        for (int i : arr) {

            count[(i / exp) % 10]++;
        }

        // This loop will replace the ith index of the count array with the sum of values at the ith and (i-1)th index
        for (int i = 1; i < count.length; i++) {

            count[i] = count[i] + count[i - 1];
        }

        // This array will store the sorted array
        Integer[] places = new Integer[arr.length];

        // This loop will put the ith element at is correct position in the places array
        for (int i = arr.length - 1; i >= 0; i--) {

            // Getting the value of the index - the value at the count array index will be replaced by the value
            // in the original array
            int index = arr[i];
            places[count[(index / exp) % 10] - 1] = index;
            count[(index / exp) % 10]--;
        }

        // Copy the places array back to the original array - which will be sorted
        System.arraycopy(places, 0, arr, 0, arr.length);
    }

    public Integer[] sort(Integer[] arr) {

        // Find maximum element in the array so that we can find out maximum number of digits
        int max = arr[0];

        for (int i : arr) {
            max = Math.max(max, i);
        }

        for (int i = 1; max / i > 0; i = i * 10) {

            countSort(arr, i);
        }

        return arr;
    }
}
