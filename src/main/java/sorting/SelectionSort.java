package sorting;

public class SelectionSort {
  public SelectionSort() { }

  public static int[] sort(int[] list) {
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
