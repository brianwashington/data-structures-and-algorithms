package sorting;

/**
 * Created by brian.washington on 11/8/17.
 * Selection sort starts at the beginning of a list and finds the "remaining" value. It then swaps the minimum value
 * with the ith element of the list. Selection sort then moves to the ith+1 element and repeats the process until it
 * reaches the end of the list.
 */
public class SelectionSort {
  public SelectionSort() { }

  public static int[] sort(int[] list) {
    if(list == null || list.length <= 0) {
      return list;
    }

    for(int i=0; i < list.length; i++) {
      int minVal = list[i];
      int minPos = i;

      for(int j = i+1; j < list.length; j++) {
         if(list[j] < minVal) {
           minVal = list[j];
           minPos = j;
         }
      }

      list[minPos] = list[i];
      list[i] = minVal;
    }

    return list;
  }
}
