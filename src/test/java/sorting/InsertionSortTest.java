package sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class InsertionSortTest {

  @Test
  public void insertionSortTest() {
    int[] list = { 96, 4, 100, 53, 32, 63, 26, 68, 21, 30 };
    int[] sortedList = { 4, 21, 26, 30, 32, 53, 63, 68, 96, 100 };

    InsertionSort.sort(list);
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



    long startTime = System.currentTimeMillis();

    InsertionSort.sort(list);

    long endTime = System.currentTimeMillis();

    long time = endTime - startTime;

    System.out.println("Insertion Sort took " + time + " milliseconds.");
  }
}
