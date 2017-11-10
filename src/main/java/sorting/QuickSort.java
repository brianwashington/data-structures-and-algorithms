package sorting;

/**
 * Created by brian.washington on 11/9/17.
 */
public class QuickSort {

  public void sort(int[] list) {
    quickSort(list, 0, list.length - 1);
  }

  public void quickSort(int[] list, int start, int end) {
    if(start < end) {
      int mid = partition(list, start, end);
      quickSort(list, start, mid - 1);
      quickSort(list, mid + 1, end);
    }
  }

  public int partition(int[] list, int start, int end) {
    int pivot = list[end];
    int i = start - 1;
    int temp;

    for(int j=start; j <= end - 1; j++) {
      if(list[j] <= pivot) {
        i++;

        temp = list[i];
        list[i] = list[j];
        list[j] = temp;
      }
    }

    temp = list[i+1];
    list[i+1] = list[end];
    list[end] = temp;

    return i+1;
  }
}
