package sorting;

/**
 * Created by brian.washington on 11/9/17.
 * Quick Sort sorts by selecting an element as a "pivot" (the last element in the array). It then iterates through
 * the list and places elements that are less <= the pivot to the left side of the array. Elements that are > are left
 * alone. Once the elements have been placed, the pivot is swapped with the element that is i+1 of the last element that
 * was swapped. Quick Sort is called recursively on the left sublist and right sublist.
 * The average runtime is O(n log n) and the worst case is O(n^2). The space complexity is O(log n).
 */
public class QuickSort {

  public void sort(int[] list) {
    quickSort(list, 0, list.length - 1);
  }

  public void quickSort(int[] list, int start, int end) {
    if(start < end) {
      int mid = partition(list, start, end);
      quickSort(list, start, mid-1);
      quickSort(list, mid+1, end);
    }
  }

  public int partition(int[] list, int start, int end) {
    int pivot = list[end];
    int i = start-1;
    int temp;

    for(int j=start; j <= end-1; j++) {
      if(list[j] <= pivot) {
        i++;
        swap(list, i, j);
      }
    }

    i++;
    swap(list, i, end);

    return i;
  }

  public void swap(int[] list, int index1, int index2) {
    int temp = list[index1];
    list[index1] = list[index2];
    list[index2] = temp;
  }
}
