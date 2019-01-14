package org.redquark.algorithms.sorting;

public class PancakeSort {

    public <T extends Comparable<T>> T[] sort(T[] arr) {

        // Current size of the array - n
        int currentSize = arr.length;

        while (currentSize > 1) {

            int index = 0;
            T max = arr[0];

            for (int i = 1; i < currentSize; i++) {
                if (max.compareTo(arr[i]) < 0) {
                    max = arr[i];
                    index = i;
                }
            }

            if (index != currentSize - 1) {

                flip(arr, index);

                flip(arr, currentSize - 1);
            }

            currentSize--;
        }

        return arr;
    }

    /**
     * This method flips the array from 0 to the given index
     *
     * @param arr   - array to be flipped
     * @param index - index until which the array to be flipped
     */
    private <T extends Comparable<T>> void flip(T[] arr, int index) {

        // Temp variables
        T temp;
        int i = 0;

        while (i < index) {
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            i++;
            index--;
        }
    }
}
