package trees;

/**
 * Created by bino on 11/15/17.
 */
public class BST {
  private TreeNode root;
  private TreeNode current;

  private TreeNode head;
  private TreeNode tail;

  public BST() {
    this.root = null;
    this.current = null;

    this.head = null;
    this.tail = null;
  }

  public void add(int value) {
    TreeNode node = new TreeNode(value);

    if(this.root == null) {
      this.root = node;
      return;
    }

    add(node, this.root);
  }

  private void add(TreeNode node, TreeNode current) {
    if(node.getValue() < current.getValue()) {
      if(current.getLeftChild() != null) {
        add(node, current.getLeftChild());
      } else {
        current.setLeftChild(node);
        return;
      }
    } else {
      if(current.getRightChild() != null) {
        add(node, current.getRightChild());
      } else {
        current.setRightChild(node);
        return;
      }
    }
  }

  public void print() {
    printTree(this.root);
  }

  private void printTree(TreeNode node) {
    if(node.getLeftChild() != null) {
      printTree(node.getLeftChild());
    }

    System.out.print(node.getValue() + " ");

    if(node.getRightChild() != null) {
      printTree(node.getRightChild());
    }
  }

  public void convert() {
    this.root = convertTree(this.root);
  }

  private TreeNode convertTree(TreeNode node) {
    if(node == null) {
      return null;
    }

    TreeNode left = convertTree(node.getLeftChild());
    TreeNode right = convertTree(node.getRightChild());

    node.setLeftChild(node);
    node.setRightChild(node);

    return combine(left, combine(node, right));
  }

  public TreeNode combine(TreeNode left, TreeNode right) {
    if(left == null) {
      return right;
    }

    if(right == null) {
      return left;
    }

    TreeNode leftLast = left.getLeftChild();
    TreeNode rightLast = right.getLeftChild();

    leftLast.setRightChild(right);
    right.setLeftChild(leftLast);

    left.setLeftChild(rightLast);
    rightLast.setRightChild(left);

    return left;
  }

  public void printConversion() {
    TreeNode head = this.root;
    TreeNode current = this.root;

    do {
      System.out.print(current.getValue() + " ");
      current = current.getRightChild();
    } while(current != head);
  }

  public TreeNode getRoot() {
    return this.root;
  }
}
