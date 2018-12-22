package org.redquark.algorithms.searching;

import java.util.Scanner;

/**
 * @author Anirudh Sharma
 */
public class BinarySearch {

    public static void main(String[] args) {

        // Array to be searched
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Key to be searched
        int key = new Scanner(System.in).nextInt();

        // Method that will search the key inside an array
        int index = search(arr, key, 0, arr.length - 1);

        // Check the result based on index
        if (index != -1) {
            System.out.println("Key: " + key + " is found at index: " + index);
        } else {
            System.out.println("Key: " + key + " is not present in the array");
        }
    }

    /**
     * Method that will search the key inside an array
     */
    private static int search(int[] arr, int key, int low, int high) {

        // Loop until the low is less or equal to high
        while (low <= high) {

            // Calculating the mid
            int mid = (low + high) / 2;

            // Case when the key is present in the left half of the array
            if (key < arr[mid]) {

                // updating the value of high
                high = mid - 1;


            }

            // Case when the key is present in the right half of the array
            if (key > arr[mid]) {

                // Updating the value of low
                low = mid + 1;
            }


            // When the key is found
            if (key == arr[mid]) {

                // Return the index
                return mid;
            }
        }

        // Key is not found in the array
        return -1;
    }
}
