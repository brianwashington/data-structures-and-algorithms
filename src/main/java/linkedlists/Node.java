package linkedlists;

/**
 * Created by brian.washington on 11/7/17.
 */
public class Node {
  private int value;
  private Node next;

  public Node(int value) {
    this.value = value;
    this.next = null;
  }

  public int getValue() {
    return this.value;
  }

  public Node getNext() {
    return this.next;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setNext(Node node) {
    this.next = node;
  }
}

