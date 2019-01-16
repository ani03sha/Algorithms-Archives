package org.redquark.algorithms.sorting;

/**
 * @author Anirudh Sharma
 * <p>
 * Cocktail Sort traverses through a given array in both directions alternatively.
 */
public class CocktailShakerSort {

    public <T extends Comparable<T>> T[] sort(T[] arr) {

        int start = 0;
        int end = arr.length;
        boolean flag = true;

        while (flag) {

            // Reset the loop because it might be true from the previous iteration
            flag = false;

            // Forward loop
            for (int i = start; i < end - 1; i++) {

                if (arr[i].compareTo(arr[i + 1]) > 0) {

                    // Swap the elements
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    flag = true;
                }

            }

            // If the elements are not swapped, it means they are already in correct order
            // Thus, we stop the execution of current iteration and move to the next iteration.
            if (!flag) {
                break;
            }

            // If the elements are swapped, then we reset the flag so that it can be used in next iteration
            flag = false;

            // To run loop backward, we need to update end
            end--;

            // Backward loop
            for (int i = end - 1; i >= start; i--) {

                if (arr[i].compareTo(arr[i + 1]) > 0) {

                    // Swap the elements
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    flag = true;
                }
            }

            // For the next iteration of forward loop
            start++;
        }

        return arr;
    }
}
