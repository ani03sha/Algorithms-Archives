package org.redquark.algorithms.main.sorting;

/**
 * @author Anirudh Sharma
 * <p>
 * Pigeonhole sorting is a sorting algorithm that is suitable for sorting lists of elements where the number
 * of elements and the number of possible key values are approximately the same.
 * <p>
 * It requires O(n + Range) time where n is number of elements in input array and ‘Range’ is number of possible
 * values in array.
 */
public class PigeonholeSort {

    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {8, 3, 2, 7, 4, 6, 8};

        // This method sorts the array
        sort(arr, arr.length);

        // This method prints the sorted array
        print(arr);
    }

    /**
     * This method sorts the array
     */
    private static void sort(int[] arr, int n) {

        // Find maximum and minimum elements in array
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < n; i++) {

            // For minimum value
            if (min > arr[i]) {
                min = arr[i];
            }

            // For maximum value
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // Range
        int range = max - min + 1;

        // Pigeonhole array
        int[] pigeonholes = new int[range];

        // Put each element of arr in its pigeonhole
        for (int i = 0; i < n; i++) {
            pigeonholes[arr[i] - min] = arr[i];
        }

        // Index for the arr
        int index = 0;

        // Loop over pigeonhole array
        for (int pigeonhole : pigeonholes) {

            // Put non zero elements from the pigeonhole array to the current element of arr
            if (pigeonhole != 0) {
                arr[index++] = pigeonhole;
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
