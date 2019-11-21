package lesson16.tree;

public class XTree {
  public XNode root;

  public void add(int value) {
    if (root == null) {
      root = new XNode(value);
    } else {
      XNode current = root;
      while (true) {
        if (value < current.value) {
          if (current.left == null) {
            current.left = new XNode(value);
            break;
          } else {
            current = current.left;
          }
        } else if (value > current.value) {
          if (current.right == null) {
            current.right = new XNode(value);
            break;
          } else {
            current = current.right;
          }
        } else {
          break;
        }
      }
    }
  }

  boolean contains(int value) {
    XNode current = root;
    while (current != null) {
      if (value < current.value) {
        current = current.left;
      } else if (value > current.value) {
        current = current.right;
      } else return true;
    }
    return false;
  }

}
