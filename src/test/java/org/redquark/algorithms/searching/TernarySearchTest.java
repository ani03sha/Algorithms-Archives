package org.redquark.algorithms.searching;

import org.junit.Assert;
import org.junit.Test;

public class TernarySearchTest {

    private TernarySearch ternarySearch = new TernarySearch();

    @Test
    public void ternarySearchIntegerTest() {

        // Array to be searched
        Integer[] arr = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Assert.assertEquals("Incorrect index", 9, ternarySearch.search(arr, 9, 0, arr.length - 1));
        Assert.assertEquals("Incorrect index", 5, ternarySearch.search(arr, 5, 0, arr.length - 1));
        Assert.assertEquals("Incorrect index", 4, ternarySearch.search(arr, 4, 0, arr.length - 1));
    }

    @Test
    public void ternarySearchFloatTest() {

        // Array to be searched
        Float[] arr = new Float[]{-21.3f, -3.2f, 0.9f, 5.9f, 6.7f, 21.1f};

        Assert.assertEquals("Incorrect index", 2, ternarySearch.search(arr, 0.9f, 0, arr.length - 1));
        Assert.assertEquals("Incorrect index", 3, ternarySearch.search(arr, 5.9f, 0, arr.length - 1));
        Assert.assertEquals("Incorrect index", 0, ternarySearch.search(arr, -21.3f, 0, arr.length - 1));
    }

    @Test
    public void ternarySearchCharacterTest() {

        // Array to be searched
        Character[] arr = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        Assert.assertEquals("Incorrect index", 9, ternarySearch.search(arr, 'j', 0, arr.length - 1));
        Assert.assertEquals("Incorrect index", 2, ternarySearch.search(arr, 'c', 0, arr.length - 1));
        Assert.assertEquals("Incorrect index", 6, ternarySearch.search(arr, 'g', 0, arr.length - 1));
    }

    @Test
    public void ternarySearchStringTest() {

        // Array to be searched
        String[] arr = new String[]{"Alan", "David", "Dennis", "Edward", "Ken", "Linus", "Robert"};

        Assert.assertEquals("Incorrect index", 2, ternarySearch.search(arr, "Dennis", 0, arr.length - 1));
        Assert.assertEquals("Incorrect index", 3, ternarySearch.search(arr, "Edward", 0, arr.length - 1));
        Assert.assertEquals("Incorrect index", 0, ternarySearch.search(arr, "Alan", 0, arr.length - 1));
    }
}
