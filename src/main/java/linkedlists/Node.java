package linkedlists;

/**
 * Created by brian.washington on 11/7/17.
 */
public class Node {
  private int value;
  private Node next;
  private Node prev;

  public Node(int value) {
    this.value = value;
    this.next = null;
    this.prev = null;
  }

  public int getValue() {
    return this.value;
  }

  public Node getNext() {
    return this.next;
  }

  public Node getPrev() {
    return this.prev;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setNext(Node node) {
    this.next = node;
  }

  public void setPrev(Node prev) {
    this.prev = prev;
  }
}

