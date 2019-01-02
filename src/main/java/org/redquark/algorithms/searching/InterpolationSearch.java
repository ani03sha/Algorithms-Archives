package org.redquark.algorithms.searching;

/**
 * @author Anirudh Sharma
 * <p>
 * The Interpolation Search is an improvement over Binary Search for instances,
 * where the values in a sorted array are uniformly distributed. Binary Search
 * always goes to the middle element to check. On the other hand, interpolation
 * search may go to different locations according to the value of the key being searched.
 * <p>
 * For example, if the value of the key is closer to the last element, interpolation search
 * is likely to start search toward the end side.
 */
public class InterpolationSearch {

    /**
     * This method searches the array
     */
    public int search(Integer[] arr, int key, int low, int high) {

        while (low <= high && key >= arr[low] && key <= arr[high]) {

            // Probing the position with keeping uniform distribution in mind
            int position = low + ((key - arr[low]) * (high - low) / (arr[high] - arr[low]));

            // If the key is at the current position
            if (arr[position] == key) {
                return position;
            }

            // If key is is less than the element at the position then we apply the formula in left
            // subarray
            if (key < arr[position]) {
                high = position - 1;
            }

            // If key is is greater than the element at the position then we apply the formula in right
            // subarray
            if (key > arr[position]) {
                low = position + 1;
            }
        }

        // Key is not found
        return -1;
    }
}
