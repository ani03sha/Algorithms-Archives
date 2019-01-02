package org.redquark.algorithms.searching;

import org.junit.Assert;
import org.junit.Test;

public class InterpolationSearchTest {

    private InterpolationSearch interpolationSearch = new InterpolationSearch();

    @Test
    public void interpolationSearchIntegerTest() {

        // Array to be searched
        Integer[] arr = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Assert.assertEquals("Incorrect index", 9, interpolationSearch.search(arr, 9, 0, arr.length - 1));
        Assert.assertEquals("Incorrect index", 5, interpolationSearch.search(arr, 5, 0, arr.length - 1));
        Assert.assertEquals("Incorrect index", 4, interpolationSearch.search(arr, 4, 0, arr.length - 1));
    }
}
