package linkedlists;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by brian.washington on 11/7/17.
 */
public class LinkedListTest {

  @Test
  public void testLengthAfterAddingNode() {
    LinkedList linkedList = new LinkedList();

    Assert.assertEquals(linkedList.getLength(), 0);
    linkedList.add(new Node(1));

    Assert.assertEquals(linkedList.getLength(), 1);
  }

  @Test
  public void testHeadPointsToFirstAddedNode() {
    LinkedList linkedList = new LinkedList();
    Node node = new Node(1);

    linkedList.add(node);
    Assert.assertSame(linkedList.getHead(), node);
  }

  @Test
  public void testTailPointsToNull() {
    LinkedList linkedList = new LinkedList();
    Node node = new Node(1);

    linkedList.add(node);
    Assert.assertNull(linkedList.getTail().getNext());
  }
}
