package org.redquark.algorithms.main.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Bucket sort is mainly useful when input is uniformly distributed over a range.
 * <p>
 * For example - Sort a large set of floating point numbers which are in range from 0.0 to 1.0
 * and are uniformly distributed across the range.
 */
public class BucketSort {

    public static void main(String[] args) {

        // Array to be sorted
        float[] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};

        // This method sorts the array
        sort(arr, arr.length);

        // This method prints the sorted array
        print(arr);
    }

    /**
     * This method sorts the array
     */
    private static void sort(float[] arr, int n) {

        List<Float>[] buckets = new List[n];

        // Created instances of all the buckets
        Arrays.setAll(buckets, ArrayList::new);

        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * arr[i]);
            buckets[bucketIndex].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate all the buckets into arr
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    /**
     * Method that prints the elements of the array
     */
    private static void print(float[] arr) {
        for (float i : arr) {
            System.out.print(i + " ");
        }
    }
}
