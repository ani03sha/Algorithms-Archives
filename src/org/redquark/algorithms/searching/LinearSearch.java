package org.redquark.algorithms.searching;

import java.util.Scanner;

/**
 * @author Anirudh Sharma
 */
public class LinearSearch {

    public static void main(String[] args) {

        // Array to be searched
        int[] arr = {6, 1, 3, 9, 2, 4, 7, 8, 5};

        // Number to be searched
        int key = new Scanner(System.in).nextInt();

        // Method that will search the key inside an array
        int index = search(arr, key);

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
    private static int search(int[] arr, int key) {

        // Loop until the key is not found
        for (int i = 0; i < arr.length; i++) {

            // If the current element is equal to the key
            if (key == arr[i]) {
                return i;
            }
        }

        // Key is not found in the entire array
        return -1;
    }
}
