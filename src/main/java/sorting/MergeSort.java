package sorting;

/**
 * Created by bino on 11/8/17.
 * Merge sort is a divide and conquer algorithm that takes a list of elements and recursively cuts the list in half
 * until the list contains only one element. It then merges this list with the remaining list to build up a sorted list.
 */
public class MergeSort {
  public int[] helper;

  public void sort(int[] list) {
    this.helper = new int[list.length];
    mergeSort(list, 0, list.length - 1);
  }

  public void mergeSort(int[] list, int start, int end) {
    if(start < end) {
      int mid = (start + end) / 2;

      mergeSort(list, start, mid);
      mergeSort(list, mid + 1, end);

      merge(list, start, mid, end);
    }
  }

  public void merge(int[] list, int start, int mid, int end) {
    for(int i=start; i<=end; i++) {
      helper[i] = list[i];
    }

    int i = start;
    int j = mid + 1;
    int k = start;

    while(i <= mid && j <= end) {
      if(helper[i] <= helper[j]) {
        list[k] = helper[i];
        i++;
      } else {
        list[k] = helper[j];
        j++;
      }
      k++;
    }

    while(i <= mid) {
      list[k] = helper[i];
      k++;
      i++;
    }
  }
}
