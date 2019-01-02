package org.redquark.algorithms.searching;

import org.junit.Assert;
import org.junit.Test;

public class JumpSearchTest {

    private JumpSearch jumpSearch = new JumpSearch();

    @Test
    public void jumpSearchIntegerTest() {

        // Array to be searched
        Integer[] arr = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        Assert.assertEquals("Incorrect index", 9, jumpSearch.search(arr, 9));
        Assert.assertEquals("Incorrect index", 5, jumpSearch.search(arr, 5));
        Assert.assertEquals("Incorrect index", 4, jumpSearch.search(arr, 4));
    }

    @Test
    public void jumpSearchFloatTest() {

        // Array to be searched
        Float[] arr = new Float[]{-21.3f, -3.2f, 0.9f, 5.9f, 6.7f, 21.1f};

        Assert.assertEquals("Incorrect index", 2, jumpSearch.search(arr, 0.9f));
        Assert.assertEquals("Incorrect index", 3, jumpSearch.search(arr, 5.9f));
        Assert.assertEquals("Incorrect index", 0, jumpSearch.search(arr, -21.3f));
    }

    @Test
    public void jumpSearchCharacterTest() {

        // Array to be searched
        Character[] arr = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'};

        Assert.assertEquals("Incorrect index", 9, jumpSearch.search(arr, 'j'));
        Assert.assertEquals("Incorrect index", 2, jumpSearch.search(arr, 'c'));
        Assert.assertEquals("Incorrect index", 6, jumpSearch.search(arr, 'g'));
    }

    @Test
    public void jumpSearchStringTest() {

        // Array to be searched
        String[] arr = new String[]{"Alan", "David", "Dennis", "Edward", "Ken", "Linus", "Robert"};

        Assert.assertEquals("Incorrect index", 2, jumpSearch.search(arr, "Dennis"));
        Assert.assertEquals("Incorrect index", 3, jumpSearch.search(arr, "Edward"));
        Assert.assertEquals("Incorrect index", 0, jumpSearch.search(arr, "Alan"));
    }
}
