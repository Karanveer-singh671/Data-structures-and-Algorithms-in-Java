// 2 way linked list
// given a node, can navigate list in both directions, 
// A node in SLL can only be detected if we have a pointer to its previous node but in Doubly LL we can delete the node even if we don't have a pointer to its previous node 
// here the head previous pointer is null and tail next pointer is null
// in SLL null in next pointer means end of list 

// SLL  |DATA|NEXT|
// DLL  |PREVIOUS|DATA|NEXT|

public class DoublyLinkedList {
  // instance variable
  private ListNode head;
  private ListNode tail;
  // length of doublyLinkedList
  private int length;
      
  private class ListNode {
    private int data;
    private ListNode next;
    private ListNode previous;
  }
  // constructor
  public ListNode(int data) {
    this.data = data
  }
  // initially construct has pointers to null and length to 0
  public DoublyLinkedList() {
    this.head = null
    this.tail = null
    this.length = 0
  }

  public boolean isEmpty() {
    return length == 0; // head == null 
  }

  public int length() {
    return length
  }

  public printDataForwardInDLL() {
    if(head == null) {
      return
    }
    ListNode temp = head
    while (temp != null) {
      System.out.print(temp.data + " --> ")
      temp = temp.next
    }
    System.out.print("null")
  }

  public printDataBackwardInDLL() {
    if(tail == null) {
      return
    }
    ListNode temp = tail
    while (temp != null) {
      System.out.print(temp.data + " --> ")
      temp = temp.previous
    }
    System.out.print("null")
  }
}
