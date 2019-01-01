package org.redquark.algorithms.main.sorting;

/**
 * @author Anirudh Sharma
 * <p>
 * Insertion sort is based on the idea that one element from the input elements is consumed in each iteration to find
 * its correct position i.e, the position to which it belongs in a sorted array.
 * <p>
 * It iterates the input elements by growing the sorted array at each iteration. It compares the current element with
 * the largest value in the sorted array. If the current element is greater, then it leaves the element in its place
 * and moves on to the next element else it finds its correct position in the sorted array and moves it to that position.
 * This is done by shifting all the elements, which are larger than the current element, in the sorted array to one
 * position ahead.
 */

public class InsertionSort {

    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {6, 1, 3, 9, 2, 4, 7, 8, 5};

        // Method that sorts the array
        System.out.println("Sorted array using Insertion Sort:");
        sort(arr);
        // Method that prints the array
        print(arr);
    }

    /**
     * This method sorts the array
     */
    private static void sort(int[] arr) {

        // Get the length of the array
        int length = arr.length;

        // Outer loop for each pass
        for (int i = 1; i < length; i++) {

            // Assuming the first element of the unsorted array is minimum
            int min = arr[i];

            // Variable on which inner loop will iterate
            int j = i - 1;

            // Inner loop to compare whether the element in the left side is less than the current element ...
            while (j >= 0 && arr[j] > min) {

                // ... moving the left side element to one position forward
                arr[j + 1] = arr[j];
                j--;
            }

            // Moving current element to its correct position
            arr[j + 1] = min;
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
