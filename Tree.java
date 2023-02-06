public class Tree<T> {
  Node<T> root;

  Tree() {
    this.root = null;
  }

  Tree(T value) {
    this.root = new Node<T>(value);
  }

  void addNode(T value, Node<T> parent) {
    Node<T> newNode = new Node<>(value, parent);
    parent.children.add(newNode);
  }

  void removeNode(Node<T> node) {
    node.parent.children.remove(node);
  }

  void preOrderTraversal(Node<T> node) {
    System.out.print(node.value + " ");
    for (Node<T> child : node.children) {
      preOrderTraversal(child);
    }
  }

  void postOrderTraversal(Node<T> node) {
    for(Node<T> child : node.children) {
      postOrderTraversal(child);
    }

    System.out.print(node.value + " ");
  }

  void inOrderTraversal(Node<T> node) {
    int n = node.children.size();
    if (n == 0) System.out.print(node.value + " ");
    else {
      for (int i = 0; i < n / 2; i++) {
        inOrderTraversal(node.children.get(n));
        System.out.print(node.value + " ");
      }
      inOrderTraversal(node.children.get(node.children.size() - 1));
    }
  }
}
