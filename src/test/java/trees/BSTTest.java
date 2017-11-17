package trees;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bino on 11/15/17.
 */
public class BSTTest {

  @Test
  public void printTest() {
    BST bst = new BST();
    TreeNode root;

    bst.add(15);
    bst.add(18);
    bst.add(6);

    bst.add(20);

    bst.print();
    System.out.println();

    root = bst.getRoot();

    Assert.assertEquals(root.getLeftChild().getValue(), 6);
    Assert.assertEquals(root.getRightChild().getValue(), 18);
    Assert.assertEquals(root.getValue(), 15);
    Assert.assertEquals(root.getRightChild().getRightChild().getValue(), 20);
  }

  @Test
  public void convertTest() {
    BST bst = new BST();
    TreeNode root;

    bst.add(15);
    bst.add(18);
    bst.add(6);

    bst.add(20);

    root = bst.getRoot();

    Assert.assertEquals(root.getLeftChild().getValue(), 6);
    Assert.assertEquals(root.getRightChild().getValue(), 18);
    Assert.assertEquals(root.getValue(), 15);
    Assert.assertEquals(root.getRightChild().getRightChild().getValue(), 20);

    bst.add(3);
    bst.add(4);
    bst.add(2);
    bst.add(7);
    bst.add(13);
    bst.add(9);
    bst.add(17);

    bst.convert();
    bst.printConversion();
    System.out.println();
  }

  @Test
  public void combineTestFromLeft() {
    TreeNode node1 = new TreeNode(15);
    TreeNode node2 = new TreeNode(18);
    TreeNode node3 = new TreeNode(20);

    BST bst = new BST();

    node1.setLeftChild(node1);
    node1.setRightChild(node1);

    node2.setLeftChild(node2);
    node2.setRightChild(node2);

    node3.setLeftChild(node3);
    node3.setRightChild(node3);

    bst.combine(node2, node3);

    Assert.assertEquals(node2.getLeftChild(), node3);
    Assert.assertEquals(node2.getRightChild(), node3);

    Assert.assertEquals(node3.getLeftChild(), node2);
    Assert.assertEquals(node3.getRightChild(), node2);

    bst.combine(node1, node2);
    Assert.assertEquals(node1.getRightChild(), node2);
    Assert.assertEquals(node1.getLeftChild(), node3);

    Assert.assertEquals(node3.getRightChild(), node1);
    Assert.assertEquals(node3.getLeftChild(), node2);

  }

  @Test
  public void combineTestFromRight() {
    TreeNode node1 = new TreeNode(15);
    TreeNode node2 = new TreeNode(18);
    TreeNode node3 = new TreeNode(20);

    BST bst = new BST();

    node1.setLeftChild(node1);
    node1.setRightChild(node1);

    node2.setLeftChild(node2);
    node2.setRightChild(node2);

    node3.setLeftChild(node3);
    node3.setRightChild(node3);

    bst.combine(node1, node2);

    Assert.assertEquals(node1.getLeftChild(), node2);
    Assert.assertEquals(node1.getRightChild(), node2);

    Assert.assertEquals(node2.getLeftChild(), node1);
    Assert.assertEquals(node2.getRightChild(), node1);

    bst.combine(node1, node3);
    Assert.assertEquals(node1.getRightChild(), node2);
    Assert.assertEquals(node1.getLeftChild(), node3);

    Assert.assertEquals(node3.getRightChild(), node1);
    Assert.assertEquals(node3.getLeftChild(), node2);
  }
}
