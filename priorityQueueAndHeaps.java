/* Priority Queue is D.S that allows us to find the min/max element among a collection of elements in constant time, supports the following operations:
1. insert(key) - insert a key into a P.Q
2. deleteMax()/deleteMin() - return and remove the largest/ smallest key
3. getMax()/getMin() - return largest / smallest key */

/* Binary Heap is  D.S that helps us in implementing a Priority Queue operations efficiently. A binary heap is a complete binary tree in which each node value is >= or <= the value of its children
Min Heap: 
current Nodes value are less than or equal to its children 
min value is at the top(heap[1] (index 1 since first index 0 is empty))) since the node's childrens value will be greater than or equal to it and those children's children value will be greater than or equal to orginal node's children
Max Heap:
current Nodes value is greater than or equal to its children
max value is at the top (heap[1] (index 1 since first index 0 is empty)) since the childrens value will be smaller than or equal to it and those children's children will be smaller than or equal to the original node's children
Implemented by:
usually by arrays
children of any particular index will be kth index = 2k, 2k+1
parent of kth index = k/2, take integer value floor 
first entry of array is taken as empty 
binary heaps are complete B.T the values are stored in array by traversing tree, lvl by level, from left to right */

/* Complete Binary tree is a Binary Tree where all levels are completely filled (lvl 1 has 1 node, lvl 2 has 2 nodes etc. lvl 3 has 4 for a complete lvl) except last level and last level has nodes in such a way that the left side is never empty */

// AKA max heap
public class MaxPQ {
  private int[] heap;
  private int n; // size of max heap
  // capacity is the number of nodes in the tree
  public MaxPQ(int capacity) {
    // since heap's index[0] is empty
    heap = new Integer[capacity + 1]
    // when intialize no elements in heap
    n = 0
  }

  public boolean isEmpty() {
    return n == 0
  }
  // currently how many elements does the max heap have
  public int size() {
    return n
  }

  public static void main(String[], args) {
    MaxPQ pq = new MaxPQ(3)
    System.out.print(pq.size()) // should print 0
    System.out.print(pq.isEmpty()) // true
  }
}