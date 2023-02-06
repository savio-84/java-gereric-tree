import java.util.ArrayList;

public class Node<T> {
  T value;
  ArrayList<Node<T>> children;
  Node<T> parent;

  Node(T value) {
    this.value = value;
    this.children = new ArrayList<>();
    this.parent = null;
  }

  Node(T value, Node<T> parent) {
    this.value = value;
    this.children = new ArrayList<>();
    this.parent = parent;
  }
}
