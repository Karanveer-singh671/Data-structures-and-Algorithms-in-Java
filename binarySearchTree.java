/* type of binary tree in which data is organized in an ordered manner which helps in faster search and insertion of data.
It satisfies the properties:
1. the left subtree of a node contains only nodes with values lesser than the node's value 
2. the right subtree of a node contains only nodes with values greater than the node's value
3. the left and right subtree each must also be a BST 
TreeNode:
null <-- left|data|right --> null
*/

public class BinarySearchTree {
  // instance var property of BST
  private TreeNode root;
  // inner class
    private class TreeNode {
      // property of TreeNode
      private TreeNode left;
      private TreeNode right;
      private int data;
      // constructor in class to be called on creation 
      public TreeNode(int data) {
        this.data = data
      }
    }

  public TreeNode insert(TreeNode root, int value) {
    if(root == null) { // base case 
      root = new TreeNode(value)
      // return the one inserted node
      return root
    }
    /* empty free just create new Tree Node with value after 
    first method call leaves at root.left = insert(root.left, value) (original first method has value of root of 5)
    now there is a second call to insert using null as root.left, which goes and creates the new TreeNode thanks to the if statement
    since we return root the method insert gets off the call stack and we go to our original first call left on line 7 with root value of 5 
    then at the original roots left side we insert the TreeNode with the value and that will be the original node's root.left */ 
    if(value < root.data) {
      root.left = insert(root.left, value)
    } else {
      root.right = insert(root.right, value)
    }
    return root
  }

  public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
  }
  
  public TreeNode search(TreeNode root, int key) {
    // if there is no Nodes or root.data == key then that is the key
    if(root == null || root.data == key) {
      return root
    }
    if(key < root.data) {
      return search(root.left, key)
    } else {
      return search(root.right, key)
    }
  }
 
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(1);
		
		bst.inOrder();
	}
}