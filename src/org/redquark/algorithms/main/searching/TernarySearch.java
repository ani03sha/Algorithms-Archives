package org.redquark.algorithms.main.searching;

import java.util.Scanner;

public class TernarySearch {

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

        // Check if low index is less than or equal to high
        if (low <= high) {

            // We have to calculate two mid values which will divide the array in three parts
            int mid1 = low + (high - 1) / 3;
            int mid2 = high - (high - 1) / 3;

            // Check if the key is equal to the element at mid1 index of the array
            if (key == arr[mid1]) {
                return mid1;
            }

            // Check if the key is equal to the element at mid2 index of the array
            if (key == arr[mid2]) {
                return mid2;
            }

            // Check in which portion of the array the key lies - Recursive approach
            if (key < arr[mid1]) {
                return search(arr, key, low, mid1 - 1);
            } else if (key > arr[mid2]) {
                return search(arr, key, mid2 + 1, high);
            } else {
                return search(arr, key, mid1 + 1, mid2 - 1);
            }
        }

        // Key is not found in the array
        return -1;
    }
}
