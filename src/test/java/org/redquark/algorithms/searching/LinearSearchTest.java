package org.redquark.algorithms.searching;

import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {

    private LinearSearch linearSearch = new LinearSearch();

    @Test
    public void linearSearchIntegerTest() {

        // Array to be searched
        Integer[] arr = new Integer[]{6, 1, 3, 9, 2, 4, 7, 8, 5, 0};

        Assert.assertEquals("Incorrect index", 3, linearSearch.search(arr, 9));
        Assert.assertEquals("Incorrect index", 8, linearSearch.search(arr, 5));
        Assert.assertEquals("Incorrect index", 5, linearSearch.search(arr, 4));
    }

    @Test
    public void linearSearchFloatTest() {

        // Array to be searched
        Float[] arr = new Float[]{6.4f, 1.1f, 3.86f, 9.001f, 2.3f, 4.32f, 7.1f, 8.8f, 5.04f, 0.12f};

        Assert.assertEquals("Incorrect index", 9, linearSearch.search(arr, 0.12f));
        Assert.assertEquals("Incorrect index", 4, linearSearch.search(arr, 2.3f));
        Assert.assertEquals("Incorrect index", 3, linearSearch.search(arr, 9.001f));
    }

    @Test
    public void linearSearchCharacterTest() {

        // Array to be searched
        Character[] arr = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        Assert.assertEquals("Incorrect index", 9, linearSearch.search(arr, 'j'));
        Assert.assertEquals("Incorrect index", 2, linearSearch.search(arr, 'c'));
        Assert.assertEquals("Incorrect index", 6, linearSearch.search(arr, 'g'));
    }

    @Test
    public void linearSearchStringTest() {

        // Array to be searched
        String[] arr = new String[]{"Edward", "Linus", "David", "Alan", "Dennis", "Robert", "Ken"};

        Assert.assertEquals("Incorrect index", 4, linearSearch.search(arr, "Dennis"));
        Assert.assertEquals("Incorrect index", 0, linearSearch.search(arr, "Edward"));
        Assert.assertEquals("Incorrect index", 3, linearSearch.search(arr, "Alan"));
    }
}
