package sorting;

/**
 * Created by brian.washington on 11/7/17.
 * If "current" element is less than the preceding element, shift all preceding elements to the right until the current
 * element is not less than the preceding element. Insert the current element into that space.
 * Best case is O(n) if array is already sorted, otherwise O(n^2). O(1) space requirements as it can be done in place.
 */
public class InsertionSort {
  public static int[] sort(int[] list) {
    for(int i=1; i<list.length; i++) {
      int j = i;
      int current = list[i];

      while(j >= 1 && current < list[j-1]) {
        list[j] = list[j-1];
        j--;
      }

      list[j] = current;
    }

    return list;
  }
}
