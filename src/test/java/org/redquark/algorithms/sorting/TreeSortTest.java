package org.redquark.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

public class TreeSortTest {

    private TreeSort treeSort = new TreeSort();

    @Test
    public void treeSortIntegerTest() {

        // Unsorted integer array
        Integer[] unsorted = new Integer[]{5, 1, 7, 0, 2, 9, 6, 3, 4, 8};

        // Sorted integer array
        Integer[] sorted = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Comparing the two integer arrays
        Assert.assertArrayEquals(sorted, treeSort.sort(unsorted));
    }
}
