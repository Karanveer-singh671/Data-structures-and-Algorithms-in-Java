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

    private class TreeNode {
      // property of TreeNode
      private TreeNode left;
      private TreeNode right;
      private int data;

      public TreeNode(int data) {
        this.data = data
      }
    }


  public static void main(String[], args) {
  
  }
}