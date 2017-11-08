package sorting;

/**
 * Created by brian.washington on 11/7/17.
 * Bubble Sort is the sort where you compare two adjacent items and swap them, if necessary. Once you can get through
 * the entire list without having to swap then you know that the list is sorted. Bubble Sort has a best-case run-time
 * of O(n) if the list is already sorted. Otherwise, the run-time is O(n^2). O(1) space.
 */
public class BubbleSort {

  public BubbleSort() { }

  public static int[] sort(int[] list) {
    boolean sorted = false;

    while(!sorted) {
      sorted = true;

      for(int i=1; i < list.length; i++) {
        if(list[i-1] > list[i]) {
          int temp = list[i];
          list[i] = list[i-1];
          list[i-1] = temp;
          sorted = false;
        }
      }
    }

    return list;
  }
}
