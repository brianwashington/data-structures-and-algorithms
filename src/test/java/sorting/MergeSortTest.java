package sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by bino on 11/8/17.
 */
public class MergeSortTest {

  @Test
  public void mergeSortTest() {
    int[] list = { 96, 4, 100, 53, 32, 63, 26, 68, 21, 30 };
    int[] sortedList = { 4, 21, 26, 30, 32, 53, 63, 68, 96, 100 };

    MergeSort mergeSort = new MergeSort();
    mergeSort.sort(list);

    Assert.assertArrayEquals(list, sortedList);
  }

 // @Test
  public void timeTest() {
    int max = 100;
    int min = 1;
    int[] list = new int[100000000];

    Random rand = new Random();

    for(int i=0; i<100000000-1; i++) {
      list[i] = rand.nextInt((max - min) + 1) + min;
    }

    MergeSort mergeSort = new MergeSort();

    long startTime = System.currentTimeMillis();

    mergeSort.sort(list);

    long endTime = System.currentTimeMillis();

    long time = endTime - startTime;

    System.out.println("Merge Sort took " + time + " milliseconds.");
  }
}
