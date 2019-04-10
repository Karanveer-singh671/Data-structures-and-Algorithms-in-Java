/* non linear data structure used for storing data
 made up of nodes and edges without having any cycle 
 each node in a tree can point to n number of nodes in a tree
 parent node called root and many levels of additional nodes
 node with no children (pointing to any other nodes) are called leaf nodes.

Binary tree if each node has 0, 1 or 2 children
TreeNode is: 
null<--|left|data|right --> null */


/* pre order B.T traversal
1. visit the root node
2. traverse the left subtree in PreOrder fashion
3. traverse the right subtree in PreOrder fashion */



public class BinaryTree {
  private TreeNode root;

  private class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private int data; // generic type could be

    public TreeNode(int data) {
      this.data = data;
    }
  }

  public void createBinaryTree() {
    TreeNode first = new TreeNode(1)
    TreeNode second = new TreeNode(2)
    TreeNode third = new TreeNode(3)
    TreeNode fourth = new TreeNode(4)
    TreeNode fifth = new TreeNode(5)

    root = first; // root --> first
    first.left = second
    first.right = third // // second <--- root ---> third
    second.left = fourth
    second.right = fifth  // fourth <-- second --> fifth
    
    // null <-- third --> null
  }

  public void preOrder(TreeNode root) {
    // base/terminate case to terminate method and get to next method in call stack
    if(root == null) {
      return
    }
    // print data of current root used as param
    System.out.print(root.data + " ")
    // put root left on call stack keep adding additional method calls on call stack until terminate case
    // work wherever pointer is on call stack to run that specific node
    preOrder(root.left)
    preOrder(root.right);
  }

  public static void main(String[], args) {
    BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		bt.preOrder(bt.root);
  }
}