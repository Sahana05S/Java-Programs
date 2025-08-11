class ANode{
    int key,height;
    ANode left, right;
    ANode(int key) {
        this.key = key;
        this.height = 1;
    }
}
class AVL {
  ANode root;
  int height(ANode root) {
      return (root == null) ? 0 : root.height;
  }
  int max(int a, int b) {
      return (a > b) ? a : b;
  }

  ANode rightRotate(ANode root) {
      ANode x = root.left;
      ANode T2 = x.right;
      x.right = root;
      root.left = T2;
      root.height = max(height(root.left), height(root.right)) + 1;
      x.height = max(height(x.left), height(x.right)) + 1;
      return x;
  }
  ANode leftRotate(ANode root) {
      ANode y = root.right;
      ANode T2 = y.left;
      y.left = root;
      root.right = T2;
      root.height = max(height(root.left), height(root.right)) + 1;
      y.height = max(height(y.left), height(y.right)) + 1;
      return y;
  }
  int getBalance(ANode root) {
      return (root == null) ? 0 : height(root.left) - height(root.right);
  }
  ANode insert(ANode root, int key) {
      if (root == null) {
          return new ANode(key);
      }
      if (key < root.key) {
          root.left = insert(root.left, key);
      } else if (key > root.key) {
          root.right = insert(root.right, key);
      } else {
          return root; // Duplicate keys are not allowed
      }
      root.height = 1 + max(height(root.left), height(root.right));
      int balance = getBalance(root);
      if (balance > 1 && key < root.left.key) {
          return rightRotate(root);
      }
      if (balance < -1 && key > root.right.key) {
          return leftRotate(root);
      }
      if (balance > 1 && key > root.left.key) {
          root.left = leftRotate(root.left);
          return rightRotate(root);
      }
      if (balance < -1 && key < root.right.key) {
          root.right = rightRotate(root.right);
          return leftRotate(root);
      }
      return root;
  }
  void inorder(ANode root) {
      if (root != null) {
          inorder(root.left);
          System.out.print(root.key + " ");
          inorder(root.right);
      }
  }

  public static void main(String[] args) {
      AVL tree = new AVL();
      tree.root = tree.insert(tree.root, 10);
      tree.root = tree.insert(tree.root, 20);
      tree.root = tree.insert(tree.root, 30);
      tree.root = tree.insert(tree.root, 40);
      tree.root = tree.insert(tree.root, 50);
      tree.root = tree.insert(tree.root, 25);
      System.out.println("Inorder traversal of the constructed AVL tree is:");
      tree.inorder(tree.root); 
  }
}
