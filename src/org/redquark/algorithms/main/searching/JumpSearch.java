package org.redquark.algorithms.main.searching;

/**
 * @author Anirudh Sharma
 * <p>
 * Jump Search is a searching algorithm for sorted arrays.
 * <p>
 * The basic idea is to check fewer elements (than linear search)
 * by jumping ahead by fixed steps or skipping some elements in
 * place of searching all elements.
 */
public class JumpSearch {

    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};

        // Element to be searched
        int key = 144;

        int result = search(arr, key);

        if (result != -1) {
            System.out.println("Element: " + key + " is found at index: " + result);
        } else {
            System.out.println("Element is not present in the array");
        }
    }

    private static int search(int[] arr, int key) {

        // Length of the array
        int n = arr.length;

        // Block size
        int blockSize = (int) Math.sqrt(n);

        // This loop will find out the interval in which the key lies
        for (int i = blockSize; i <= n; i = i + blockSize - 1) {

            // If key is less than or equal to the current element of the array,
            // Then we have found the interval which is from (i-blockSize) to i
            if (key <= arr[i - 1]) {

                // Perform linear search in the interval
                for (int j = i - blockSize; j <= i; j++) {
                    if (key == arr[j]) {

                        // Returning the index where the element is found
                        return j;
                    }
                }
            }
        }

        // Key is not found in the array
        return -1;
    }
}
