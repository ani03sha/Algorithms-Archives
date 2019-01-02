package org.redquark.algorithms.searching;

import org.junit.Assert;
import org.junit.Test;

public class ExponentialSearchTest {

    private ExponentialSearch exponentialSearch = new ExponentialSearch();

    @Test
    public void exponentialSearchIntegerTest() {

        // Array to be searched
        Integer[] arr = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Assert.assertEquals("Incorrect index", 9, exponentialSearch.search(arr, 9));
        Assert.assertEquals("Incorrect index", 5, exponentialSearch.search(arr, 5));
        Assert.assertEquals("Incorrect index", 4, exponentialSearch.search(arr, 4));
    }

    @Test
    public void exponentialSearchFloatTest() {

        // Array to be searched
        Float[] arr = new Float[]{-21.3f, -3.2f, 0.9f, 5.9f, 6.7f, 21.1f};

        Assert.assertEquals("Incorrect index", 2, exponentialSearch.search(arr, 0.9f));
        Assert.assertEquals("Incorrect index", 3, exponentialSearch.search(arr, 5.9f));
        Assert.assertEquals("Incorrect index", 0, exponentialSearch.search(arr, -21.3f));
    }

    @Test
    public void exponentialSearchCharacterTest() {

        // Array to be searched
        Character[] arr = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        Assert.assertEquals("Incorrect index", 9, exponentialSearch.search(arr, 'j'));
        Assert.assertEquals("Incorrect index", 2, exponentialSearch.search(arr, 'c'));
        Assert.assertEquals("Incorrect index", 6, exponentialSearch.search(arr, 'g'));
    }

    @Test
    public void exponentialSearchStringTest() {

        // Array to be searched
        String[] arr = new String[]{"Alan", "David", "Dennis", "Edward", "Ken", "Linus", "Robert"};

        Assert.assertEquals("Incorrect index", 2, exponentialSearch.search(arr, "Dennis"));
        Assert.assertEquals("Incorrect index", 3, exponentialSearch.search(arr, "Edward"));
        Assert.assertEquals("Incorrect index", 0, exponentialSearch.search(arr, "Alan"));
    }
}
