package org.redquark.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

public class BucketSortTest {

    private BucketSort bucketSort = new BucketSort();

    @Test
    public void bucketSortFloatTest() {

        // Unsorted floating array
        Float[] unsorted = new Float[]{0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};

        // Sorted floating array
        Float[] sorted = new Float[]{0.1234f, 0.3434f, 0.565f, 0.656f, 0.665f, 0.897f};

        // Comparing the two floating arrays
        Assert.assertArrayEquals(sorted, bucketSort.sort(unsorted, unsorted.length));
    }
}
