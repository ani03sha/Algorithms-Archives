package org.redquark.algorithms.sorting;

/**
 * @author Anirudh Sharma
 * <p>
 * Heap sort is a comparison based sorting technique based on Binary Heap data structure.
 * It is similar to selection sort where we first find the maximum element and place the maximum element at the end.
 * We repeat the same process for remaining element.
 */
public class HeapSort {

    /**
     * This method sorts the array
     */
    public <T extends Comparable<T>> T[] sort(T[] arr) {

        int n = arr.length;

        // Build the max heap - rearranging array
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i >= 0; i--) {

            // Swap current root with the last element
            T temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            // Now again call max heapify on the reduced heap
            heapify(arr, i, 0);
        }

        return arr;
    }

    /**
     * This method will heapify the heap
     */
    private <T extends Comparable<T>> void heapify(T[] arr, int n, int index) {

        // Initialized largest as the root element
        int largest = index;

        // Indexes of left and right children
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        // If left child is greater than the root node then we need to set largest as the left child
        if (left < n && arr[left].compareTo(arr[largest]) > 0) {
            largest = left;
        }

        // If right child is greater than the root node then we need to set largest as the root child
        if (right < n && arr[right].compareTo(arr[largest]) > 0) {
            largest = right;
        }

        // If the largest element is not root
        if (largest != index) {

            // swap arr[index] and arr[largest]
            T temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;

            // Recursive call for heapify for all sub nodes
            heapify(arr, n, largest);
        }
    }
}
