package org.redquark.algorithms.sorting;

/**
 * @author Anirudh Sharma
 * <p>
 * The Selection sort algorithm is based on the idea of finding the minimum or maximum element in an unsorted array
 * and then putting it in its correct position in a sorted array.
 */

public class SelectionSort {

    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {6, 1, 3, 9, 2, 4, 7, 8, 5};

        // Method that sorts the array
        System.out.println("Sorted array using Bubble Sort:");
        sort(arr);
        // Method that prints the array
        print(arr);
    }

    private static void sort(int[] arr) {

        // Length of the array
        int length = arr.length;

        // Outer loop is for each pass
        for (int i = 0; i < length; i++) {

            // Assuming that the first element of unsorted array is the minimum
            int min = arr[i];

            // Inner loop that finds the minimum element in each iteration
            for (int j = i + 1; j < length; j++) {

                // If the current element is less than the minimum ...
                if (min > arr[j]) {
                    // .. then we swap the current element and the minimum
                    int temp = min;
                    min = arr[j];
                    arr[j] = temp;
                }
            }
            // Since we have found the minimum value, we put it at its appropriate position
            arr[i] = min;
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
