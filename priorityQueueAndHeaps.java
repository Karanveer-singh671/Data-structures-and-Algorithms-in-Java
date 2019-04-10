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

/* Bottom up reheapify after insert an elem into a heap it may not satisfy above heap property. Thus perform bottom up reheapify where we 
adjust locations of elem to satisfy heap property. */

// AKA max heap
public class MaxPQ {
  // Integer[] used for object creation array
  private Integer[] heap;
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
  // value you want to insert into heap array
  public void insertNodeMaxHeap(int x) {
    // if number of elem in heap is occupying full heap (first index not used) then double heap size
    if (n == heap.length - 1) {
      resize(2*heap.length)
    }
    // increase number of elem in heap by 1 for insert
    n++
    // now n = 1 if was empty, store x as the value at n index
    heap[n] = x
    swim(n)
  }

  private void swim(int k) {
    // while have at least two elem to compare and parent is less than child val then swap
    while (k > 1 && heap[k/2] < heap[k]) {
      // perform swap store value in temp var
      int temp = heap[k]
      // copy k/2 value to k overwrite
      heap[k] = heap[k/2]
      // then set k/2 value to the temp original stored value before overwrite
      heap[k/2] = temp
      // need to iterate again and compare the swapped position with it's parent to see if that parent is smaller as well
      // until the heap property is satisfied (keep shifting up until either no elem to compare or parent is larger than children )
      k = k/2
    }
  }

  public void printMaxHeap() {
    // n size of max priority queue
    for( int i = 0; i < n; i++) {
      System.out.print(heap[i] + " ")
    }
  }

  public void resize(int capacity) {
    // creates new size twice of original heap length then copies all values in original heap to temp array and sets the temp array with new size then sets the new sized array with elem to heap
    Integer[] temp = new Integer[capacity]
    for(int i = 0; i < heap.length; i++) {
      // copy into temp array
      temp[i] = heap[i]
    }
    heap = temp
  }

  public static void main(String[], args) {
    MaxPQ pq = new MaxPQ(3)
    System.out.print(pq.size()) // should print 0
    System.out.print(pq.isEmpty()) // true
  }
}