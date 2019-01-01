package org.redquark.algorithms.sorting;

/**
 * @author Anirudh Sharma
 * <p>
 * Comb Sort is mainly an improvement over Bubble Sort. Bubble sort always compares adjacent values.
 * So all inversions are removed one by one. Comb Sort improves on Bubble Sort by using gap of size more than 1.
 * The gap starts with a large value and shrinks by a factor of 1.3 in every iteration until it reaches the value 1.
 * Thus Comb Sort removes more than one inversion counts with one swap and performs better than Bublle Sort.
 */
public class CombSort {

    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};

        // This method sorts the array
        sort(arr, arr.length);

        // This method prints the sorted array
        print(arr);
    }

    /**
     * This method sorts the array
     */
    private static void sort(int[] arr, int n) {

        // Initialize the value of gap
        int gap = n;

        // Flag that will track if the element is swapped or not
        boolean swapped = true;

        while (gap != 1 || swapped) {

            // Getting the new gap value
            gap = nextGap(gap);

            // Initialize the flag to false so that we can determine if swap happened or not
            swapped = false;

            // Compare all the elements
            for (int i = 0; i < n - gap; i++) {

                if (arr[i] > arr[i + gap]) {

                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;

                    // Set the flag to show that swap did occur
                    swapped = true;
                }
            }
        }
    }

    /**
     * This method will return the updated value of gap
     */
    private static int nextGap(int gap) {
        gap = (int) (gap / 1.3);

        if (gap < 1) {
            return 1;
        }

        return gap;
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
