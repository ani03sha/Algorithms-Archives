/*
 * Quick sort is based on the divide-and-conquer approach based on the idea of choosing one element as a pivot element
 * and partitioning the array around it such that: Left side of pivot contains all the elements that are less than the
 * pivot element Right side contains all elements greater than the pivot
 *
 * It reduces the space complexity and removes the use of the auxiliary array that is used in merge sort.
 * Selecting a random pivot in an array results in an improved time complexity in most of the cases.
 */


package org.redquark.algorithms.sorting;

public class QuickSort {

    /**
     * This method sorts the array
     */
    public <T extends Comparable<T>> T[] sort(T[] arr, int l, int r) {

        if (l < r) {
            // Getting the partition index
            int partitionIndex = partition(arr, l, r);

            // Recursive call to sort subarrays
            sort(arr, l, partitionIndex - 1); // Before partition index
            sort(arr, partitionIndex + 1, r); // After partition index
        }

        return arr;
    }

    /**
     * This function takes last element as pivot,
     * places the pivot element at its correct
     * position in sorted array, and places all
     * smaller (smaller than pivot) to left of
     * pivot and all greater elements to right
     * of pivot
     */
    private <T extends Comparable<T>> int partition(T[] arr, int l, int r) {

        // Getting the pivot as the last element of the array
        T pivot = arr[r];

        int i = l - 1;

        for (int j = l; j < r; j++) {

            // If the current element is smaller or equal to pivot
            if (arr[j].compareTo(pivot) <= 0) {

                // Increment i
                i++;

                // Swapping arr[i] and arr[j]
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swapping arr[i+1] and arr[r]
        T temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;

        return (i + 1);
    }
}
