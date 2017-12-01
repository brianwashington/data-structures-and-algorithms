package heaps;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by bino on 11/10/17.
 */
public class MaxHeapTest {

  @Test
  public void buildMaxHeapTest() {
    int[] list = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
    int[] maxHeapifiedList = { 16, 14, 10, 8, 7, 9, 3, 2, 4, 1 };

//    MaxHeap maxHeap = new MaxHeap();
//    maxHeap.buildHeap(list);
    practice.MaxHeap mh = new practice.MaxHeap();
    mh.buildHeap(list);

    Assert.assertArrayEquals(list, maxHeapifiedList);
  }

  @Test
  public void heapSortTest() {
    int[] list = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
    int[] sortedList = { 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };

//    MaxHeap maxHeap = new MaxHeap();
//    maxHeap.sort(list);

    practice.MaxHeap mh = new practice.MaxHeap();
    mh.sort(list);

    Assert.assertArrayEquals(list, sortedList);
  }

//  @Test
  public void timeTest() {
    int max = 100;
    int min = 1;
    int[] list = new int[100000000];

    Random rand = new Random();

    for(int i=0; i<100000000-1; i++) {
      list[i] = rand.nextInt((max - min) + 1) + min;
    }

    MaxHeap maxHeap = new MaxHeap();

    long startTime = System.currentTimeMillis();

    maxHeap.sort(list);

    long endTime = System.currentTimeMillis();

    long time = endTime - startTime;

    System.out.println("Heap Sort took " + time + " milliseconds.");
  }

}
