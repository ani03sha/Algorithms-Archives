package org.redquark.algorithms.sorting;

/**
 * @author Anirudh Sharma
 */
public class ShellSort {

    /**
     * This method sorts the array
     */
    public <T extends Comparable<T>> T[] sort(T[] arr) {

        int n = arr.length;

        // Start with a big gap and then we can reduce it
        for (int gap = n / 2; gap > 0; gap = gap / 2) {

            // Insertion sort for this gap size
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i++) {

                // add a[i] to the elements that have been gap sorted save a[i] in temp and make a hole at position i
                T temp = arr[i];

                // shift earlier gap-sorted elements up until the correct location for a[i] is found
                int j;

                for (j = i; j >= gap && arr[j - gap].compareTo(temp) > 0; j = j - gap) {
                    if (temp.compareTo(arr[j - gap]) < 0) {
                        arr[j] = arr[j - gap];
                    } else {
                        break;
                    }
                }

                // put temp (the original a[i]) in its correct location
                arr[j] = temp;
            }
        }

        return arr;
    }
}
