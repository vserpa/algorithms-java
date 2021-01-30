package src;

public class BinaryTree {

  public static Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    } else {
      Node cur;
      if (data <= root.data) {
        cur = insert(root.left, data);
        root.left = cur;
      } else {
        cur = insert(root.right, data);
        root.right = cur;
      }
      return root;
    }
  }

  public static int height(Node root) {
    
    if (root == null) {
      return -1;
    }

    int lefth = height(root.left);
    int righth = height(root.right);

    if (lefth > righth) {
      return lefth + 1;
    } else {
      return righth + 1;
    }
  }
  
}
