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

/* in order B.T traversal
1. Traverse left subtree in In order fashion
2. visit root node
3. Traverse right subtree in In order fashion */

/* post order B.T traversal
1. Traverse left subtree in In order fashion
2. Traverse right subtree in In order fashion
3. visit root node */

/* level order traversal
Visit nodes level by level */
import java.util.LinkedList;
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
    // recursive methods use stacks internally 
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

  public void inOrder(TreeNode root) {
    if( root == null) {
      return
    }
    inOrder(root.left)
    System.out.print(root.data + " ")
    inOrder(root.right)
  }

  public void postOrder(TreeNode root) {
    if( root == null) {
      return
    }
    postOrder(root.left)
    postOrder(root.right)
    System.out.print(root.data + " ")
  }

  public void inOrderIterative(TreeNode root) {
    if( root == null) {
      return
    }
    Stack<TreeNode> stack = new Stack<>();
    TreeNode temp = root
    while(!stack.isEmpty() || temp != null) {
      if(temp != null) {
        stack.push(temp)
        temp = temp.left
      } else {
        temp = stack.pop()
        System.out.print(temp.data + " ")
        temp = temp.right
      }
    }


  public void preOrderIterative(TreeNode root) {
    // no nodes in binary tree
    if (root == null)  {
      return 
    }
    // create stack 
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root)
    while(!stack.isEmpty()) {
      // pop root out on first iteration
      TreeNode temp = stack.pop()
      System.out.print(temp.data + " ")
      // need to check if right child of root is null, if not push on stack
      if(temp.right != null) {
        stack.push(temp.right)
      }
      // push left child node on stack after since when call pop on while loop will remove Last one in and we traverse left subtree first
      if(temp.left != null) {
        stack.push(temp.left)
      }
    }
  }
  // use a queue where the root node goes to queue first then next level left then the levels right put in queue
  public void levelOrder(TreeNode root) {
    if (root ==null ) {
      return 
    }
    Queue<TreeNode> queue = new LinkedList<>()
    queue.offer(root);
    while(!queue.isEmpty()) {
      // set temp to be the first node in the queue 
      TreeNode temp = queue.poll();
      System.out.print(temp.data + " ")
      if(temp.left != null) {
        queue.offer(temp.left)
      }
      if(temp.right != null) {
        queue.offer(temp.right)
      }
    }
  }

  public static void main(String[], args) {
    BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
    // bt.preOrder(bt.root);
    bt.preOrderIterative(bt.root);
    bt.inOrderIterative();
  }
}