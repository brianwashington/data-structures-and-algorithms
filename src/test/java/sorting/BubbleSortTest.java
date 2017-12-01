package sorting;

import org.junit.Assert;
import org.junit.Test;

/***
 * Bubble Sort is a O(n^2) algorithm that sorts by comparing to items in a list
 * and swapping them. This is done from the beginning of the list to the end and
 * repeated until no items need to be swapped.
 */

public class BubbleSortTest {

  @Test
  public void BubbleSortTest() {
    int[] list = { 96, 4, 100, 53, 32, 63, 26, 68, 21, 30 };
    int[] sortedList = { 4, 21, 26, 30, 32, 53, 63, 68, 96, 100 };

//    BubbleSort.sort(list);
    practice.BubbleSort.sort(list);
    Assert.assertArrayEquals(list, sortedList);
  }
}
