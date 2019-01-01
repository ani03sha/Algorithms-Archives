package org.redquark.algorithms.main.sorting;

public class MergeSort {

    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {6, 1, 3, 9, 2, 4, 7, 8, 5};

        // Getting the length of the array
        int length = arr.length;

        // Method that sorts the array
        System.out.println("Sorted array using Merge Sort:");
        sort(arr, 0, length - 1);

        // Method that prints the array
        print(arr);

    }

    private static void sort(int[] arr, int l, int r) {

        if (l < r) {

            // Getting the mid of the array
            int m = (l + r) / 2;

            // Left half
            sort(arr, l, m);

            // Right half
            sort(arr, m + 1, r);

            // Calling the merge function
            merge(arr, l, m, r);
        }
    }

    /**
     * This method merges the subarrays in the correct order
     */
    private static void merge(int[] arr, int l, int m, int r) {

        // Sizes of two subarrays to be merged
        int a = m - l + 1;
        int b = r - m;

        // Temporary arrays
        int[] L = new int[a];
        int[] R = new int[b];

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
            if (L[i] <= R[j]) {

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

    /**
     * Method that prints the elements of the array
     */
    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
