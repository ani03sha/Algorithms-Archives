package org.redquark.algorithms.sorting;

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

    /**
     * This method sorts the array
     */
    public <T extends Comparable<T>> T[] sort(T[] arr) {

        // Get the length of the array
        int length = arr.length;

        // Outer loop for each pass
        for (int i = 1; i < length; i++) {

            // Assuming the first element of the unsorted array is minimum
            T min = arr[i];

            // Variable on which inner loop will iterate
            int j = i - 1;

            // Inner loop to compare whether the element in the left side is less than the current element ...
            while (j >= 0 && arr[j].compareTo(min) > 0) {

                // ... moving the left side element to one position forward
                arr[j + 1] = arr[j];
                j--;
            }

            // Moving current element to its correct position
            arr[j + 1] = min;
        }

        return arr;
    }
}
