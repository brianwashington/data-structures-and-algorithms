package sorting;

import com.sun.scenario.effect.Merge;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by bino on 11/8/17.
 */
public class QuickSortTest {

  @Test
  public void quickSortTest() {
    int[] list = { 96, 4, 100, 53, 32, 63, 26, 68, 21, 30 };
    int[] sortedList = { 4, 21, 26, 30, 32, 53, 63, 68, 96, 100 };

    QuickSort quickSort = new QuickSort();
    int[] l = { 2, 1 };
    quickSort.sort(l);

    Assert.assertArrayEquals(list, sortedList);
  }

  //@Test
  public void timeTest() {
    int max = 100;
    int min = 1;
    int[] list = new int[1000000];

    Random rand = new Random();

    for(int i=0; i<1000000-1; i++) {
      list[i] = rand.nextInt((max - min) + 1) + min;
    }

    QuickSort quickSort = new QuickSort();

    long startTime = System.currentTimeMillis();

   // quickSort.sort(list);
    Arrays.sort(list);

    long endTime = System.currentTimeMillis();

    long time = endTime - startTime;

    System.out.println("Quick Sort took " + time + " milliseconds.");
  }
}
