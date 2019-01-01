package org.redquark.algorithms.main.sorting;

/**
 * @author Anirudh Sharma
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping
 * the adjacent elements if they are in wrong order.
 */

public class BubbleSort {

    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {6, 1, 3, 9, 2, 4, 7, 8, 5};

        // Method that sorts the array
        System.out.println("Sorted array using Bubble Sort:");
        sort(arr);
        // Method that prints the array
        print(arr);

        // Method that sorts the array in optimized manner
        System.out.println("\n\nSorted array using optimized Bubble Sort:");
        optimizedSort(arr);
        // Method that prints the array
        print(arr);
    }

    /**
     * Method to sort the array
     */
    private static void sort(int[] arr) {

        // Length of the array
        int length = arr.length;

        // Outer loop is for each pass
        for (int i = 0; i < length - 1; i++) {
            // Inner loop compares the adjacent elements and swap them if they are in the wrong order
            // (length - i - 1) is for comparing elements which already have been compared in the previous iterations
            for (int j = 0; j < length - i - 1; j++) {
                // If the elements are in the wrong order...
                if (arr[j + 1] < arr[j]) {
                    // ... then swap them
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * Method to sort the array in optimal way - We stop the comparisons when we find that
     * no swap has taken place in an iteration
     */
    private static void optimizedSort(int[] arr) {

        // Length of the array
        int length = arr.length;

        // Flag to indicate if the inner loop caused any swap
        boolean flag;
        // Outer loop is for each pass
        for (int i = 0; i < length - 1; i++) {
            // Initializing the flag
            flag = false;
            // Inner loop compares the adjacent elements and swap them if they are in the wrong order
            // (length - i - 1) is for comparing elements which already have been compared in the previous iterations
            for (int j = 0; j < length - i - 1; j++) {
                // If the elements are in the wrong order...
                if (arr[j + 1] < arr[j]) {
                    // ... then swap them
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    // Since the swap occurred we should set the flag
                    flag = true;
                }
            }
            // If the flag is not set then it means there was no swap, so we can stop the comparison
            if (!flag) {
                break;
            }
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
