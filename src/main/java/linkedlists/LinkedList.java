package linkedlists;

/**
 * Created by brian.washington on 11/7/17.
 */
public class LinkedList {
  private Node head;
  private Node tail;
  private int length;

  public LinkedList() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  public void add(Node node) {
    if(this.head == null) {
      this.head = node;
      this.tail = node;
    } else {
      this.tail.setNext(node);
    }

    this.length++;
  }

  public int getLength() {
    return this.length;
  }

  public Node getHead() {
    return this.head;
  }

  public Node getTail() {
    return this.tail;
  }
}
