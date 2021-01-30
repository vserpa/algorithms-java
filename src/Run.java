package src;

import java.util.ArrayList;

public class Run {
  public static void main(String[] args) {
    Node root = null;
    ArrayList<Integer> nodes = prepareNodes();

    for (Integer data: nodes) {
      root = BinaryTree.insert(root, data);
    }

    int height = BinaryTree.height(root);
    System.out.println(height);
  }

  public static ArrayList<Integer> prepareNodes() {
    ArrayList<Integer> nodes = new ArrayList();

    nodes.add(3);
    nodes.add(5);
    nodes.add(2);
    nodes.add(1);
    nodes.add(4);
    nodes.add(6);
    nodes.add(7);

    return nodes;
  }
}