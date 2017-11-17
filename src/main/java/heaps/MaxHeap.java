package heaps;

/**
 * Created by bino on 11/10/17.
 * A binary (max) heap is pretty much a binary tree where a given node has the property that it's value is greater than
 * equal to its child nodes. Heapify turns an array into a max heap and then heap sort sorts the array. Since a max heap
 * has the largest element as the first node/element, this first node is swapped with the last node in the heap. Heapify
 * is then called on the new root node to ensure that it satisfies the properties of a max heap. The last element is
 * then "removed" from the heap by decrementing the size of the heap. So the heap is, in effect, sorted from end to the
 * beginning.
 * The runtime of heap sort is O(n log n) and its space complexity is O(1) since the array is sorted in place.
 */
public class MaxHeap {
  private int heapSize;

  public void buildHeap(int[] list) {
    /* minus 1 to account for arrays starting with 0 index */
    this.heapSize = list.length-1;

    for(int i = this.heapSize / 2; i >= 0; i--) {
      heapify(list, i);
    }
  }

  public void heapify(int[] list, int index) {
    /* add 1 to each of these due to arrays starting with 0 index */
    int leftNode = (2*index) + 1;
    int rightNode = (2*index) + 2;

    int largest = leftNode <= this.heapSize && list[leftNode] > list[index] ? leftNode : index;

    if (rightNode <= this.heapSize && list[rightNode] > list[largest]) {
      largest = rightNode;
    }

    if (largest != index) {
      int temp = list[index];
      list[index] = list[largest];
      list[largest] = temp;
      heapify(list, largest);
    }
  }

  public void sort(int[] list) {
    buildHeap(list);

    for(int i = this.heapSize; i >= 1; i--) {
      int temp = list[0];
      list[0] = list[i];
      list[i] = temp;

      this.heapSize--;

      heapify(list, 0);
    }
  }
}
