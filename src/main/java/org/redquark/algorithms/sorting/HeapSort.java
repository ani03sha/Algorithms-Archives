package org.redquark.algorithms.sorting;

/**
 * @author Anirudh Sharma
 * <p>
 * Heap sort is a comparison based sorting technique based on Binary Heap data structure.
 * It is similar to selection sort where we first find the maximum element and place the maximum element at the end.
 * We repeat the same process for remaining element.
 */
public class HeapSort {

    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        // This method sorts the array
        sort(arr, arr.length);

        // This method prints the sorted array
        print(arr);
    }

    /**
     * This method sorts the array
     */
    private static void sort(int[] arr, int n) {

        // Build the max heap - rearranging array
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i >= 0; i--) {

            // Swap current root with the last element
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            // Now again call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    /**
     * This method will heapify the heap
     */
    private static void heapify(int[] arr, int n, int index) {

        // Initialized largest as the root element
        int largest = index;

        // Indexes of left and right children
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        // If left child is greater than the root node then we need to set largest as the left child
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is greater than the root node then we need to set largest as the root child
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If the largest element is not root
        if (largest != index) {

            // swap arr[index] and arr[largest]
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;

            // Recursive call for heapify for all sub nodes
            heapify(arr, n, largest);
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
