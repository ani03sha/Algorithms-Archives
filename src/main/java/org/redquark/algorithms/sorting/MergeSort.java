package org.redquark.algorithms.sorting;

import java.lang.reflect.Array;

public class MergeSort {

    /**
     * This method sots the array
     */
    public <T extends Comparable<T>> T[] sort(Class<T> type, T[] arr, int l, int r) {

        if (l < r) {

            // Getting the mid of the array
            int m = (l + r) / 2;

            // Left half
            sort(type, arr, l, m);

            // Right half
            sort(type, arr, m + 1, r);

            // Calling the merge function
            merge(type, arr, l, m, r);
        }

        return arr;
    }

    /**
     * This method merges the subarrays in the correct order
     */
    @SuppressWarnings("unchecked")
    private <T extends Comparable<T>> void merge(Class<T> type, T[] arr, int l, int m, int r) {

        // Sizes of two subarrays to be merged
        int a = m - l + 1;
        int b = r - m;

        // Temporary arrays
        T[] L = (T[]) Array.newInstance(type, a);
        T[] R = (T[]) Array.newInstance(type, b);

        // Putting data into temp arrays
        System.arraycopy(arr, l, L, 0, a);
        System.arraycopy(arr, m + 1, R, 0, b);

        /*
         * Merging the temp arrays starts from here
         */

        // Starting indexes of left and right subarrays
        int i = 0;
        int j = 0;

        // Starting array of merged subarray array
        int k = l;

        while (i < a && j < b) {

            // Check which subarray has the smaller element.
            if (L[i].compareTo(R[j]) <= 0) {

                // If left subarray has smaller element, then add it to the org.redquark.algorithms.main array ...
                arr[k] = L[i];
                i++;
            } else {

                // ... or if the right subarray has smaller element, then add it to the org.redquark.algorithms.main array
                arr[k] = R[j];
                j++;
            }

            // Since one value from either left or right subarray is added to the org.redquark.algorithms.main array,
            // we are incrementing the k
            k++;
        }

        // Copy remaining elements of left subarray, if any
        while (i < a) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of right subarray, if any
        while (j < b) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
