package org.redquark.algorithms.main.searching;

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

    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};

        // Element to be searched
        int key = 610;

        int result = search(arr, key, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Element: " + key + " is found at index: " + result);
        } else {
            System.out.println("Element is not present in the array");
        }
    }

    private static int search(int[] arr, int key, int low, int high) {

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
