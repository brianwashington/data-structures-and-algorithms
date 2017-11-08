package sorting;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

  @Test
  public void SelectionSortTest() {
    int[] list = { 96, 4, 100, 53, 32, 63, 26, 68, 21, 30 };
    int[] sortedList = { 4, 21, 26, 30, 32, 53, 63, 68, 96, 100 };

    SelectionSort.sort(list);
    Assert.assertArrayEquals(list, sortedList);
  }
}