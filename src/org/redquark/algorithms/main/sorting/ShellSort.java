package org.redquark.algorithms.main.sorting;

public class ShellSort {

    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {12, 34, 54, 2, 3};

        // This method sorts the array
        sort(arr, arr.length);

        // This method prints the sorted array
        print(arr);
    }

    /**
     * This method sorts the array
     */
    private static void sort(int[] arr, int n) {

        // Start with a big gap and then we can reduce it
        for (int gap = n / 2; gap > 0; gap = gap / 2) {

            // Insertion sort for this gap size
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i++) {

                // add a[i] to the elements that have been gap sorted save a[i] in temp and make a hole at position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until the correct location for a[i] is found
                int j;

                for (j = i; j >= gap && arr[j - gap] > temp; j = j - gap) {
                    if (temp < arr[j - gap]) {
                        arr[j] = arr[j - gap];
                    } else {
                        break;
                    }
                }

                // put temp (the original a[i]) in its correct location
                arr[j] = temp;
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
