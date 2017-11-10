package sorting;

import com.sun.scenario.effect.Merge;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bino on 11/8/17.
 */
public class QuickSortTest {

  @Test
  public void quickSortTest() {
    int[] list = { 96, 4, 100, 53, 32, 63, 26, 68, 21, 30 };
    int[] sortedList = { 4, 21, 26, 30, 32, 53, 63, 68, 96, 100 };

    QuickSort quickSort = new QuickSort();
    quickSort.sort(list);

    Assert.assertArrayEquals(list, sortedList);
  }
}
