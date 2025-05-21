import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabSortTest {

    @Test
    void TestSort(){
        int[] expected = {-2, 0, 1, 2, 3, 3, 10};
        int[] tab = {1, 3, 10, 2, -2, 0, 3};
        int[] actual = TabSort.SortAsc(tab);

        assertArrayEquals(expected, actual);
    }


    @Test
    void TestSortOnlyOneValue(){
        int[] expected = {0};
        int[] tab = {0};
        int[] actual = TabSort.SortAsc(tab);
        assertArrayEquals(expected, actual);
    }

    @Test
    void TestSortEmpty(){
        int[] expected = {};
        int[] tab = {};
        int[] actual = TabSort.SortAsc(tab);
        assertArrayEquals(expected, actual);
    }

    @Test
    void TestSortNegativeValues(){
        int[] expected = {-11, -9, -7, -3, -2, -1, -1};
        int[] tab =  {-2,-7,-9,-11,-3,-1,-1};
        int[] actual = TabSort.SortAsc(tab);
        assertArrayEquals(expected, actual);
    }

    @Test
    void TestSortPositiveValues(){
        int[] expected = {1, 2, 5, 6, 8, 11, 12};
        int[] tab =  {11, 12, 5, 1, 8, 6, 2};;
        int[] actual = TabSort.SortAsc(tab);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortAscending() {
        int[] input = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};
        int[] result = TabSort.sort(input, SortType.ASCENDING);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortDescending() {
        int[] input = {5, 3, 8, 1, 2};
        int[] expected = {8, 5, 3, 2, 1};
        int[] result = TabSort.sort(input, SortType.DESCENDING);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortEmptyArray() {
        int[] input = {};
        int[] expected = {};
        int[] result = TabSort.sort(input, SortType.ASCENDING);
        assertArrayEquals(expected, result);

        result = TabSort.sort(input, SortType.DESCENDING);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortSingleElement() {
        int[] input = {42};
        int[] expected = {42};
        int[] result = TabSort.sort(input, SortType.ASCENDING);
        assertArrayEquals(expected, result);

        result = TabSort.sort(input, SortType.DESCENDING);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortAlreadySortedAscending() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = TabSort.sort(input, SortType.ASCENDING);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortAlreadySortedDescending() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {5, 4, 3, 2, 1};
        int[] result = TabSort.sort(input, SortType.DESCENDING);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortDescendingWithNegativ() {
        int[] input = {-5, 4, 10, -2, 1};
        int[] expected = {10, 4, 1, -2, -5};
        int[] result = TabSort.sort(input, SortType.DESCENDING);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortAscendingWithNegativ() {
        int[] input = {-5, 4, 10, -2, 1};
        int[] expected = {-5, -2, 1, 4, 10};
        int[] result = TabSort.sort(input, SortType.ASCENDING);
        assertArrayEquals(expected, result);
    }



}