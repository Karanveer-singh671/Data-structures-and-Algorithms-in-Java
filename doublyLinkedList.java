// 2 way linked list
// given a node, can navigate list in both directions, 
// A node in SLL can only be detected if we have a pointer to its previous node but in Doubly LL we can delete the node even if we don't have a pointer to its previous node 
// here the head previous pointer is null and tail next pointer is null
// in SLL null in next pointer means end of list 

// SLL  |DATA|NEXT|
// DLL  |PREVIOUS|DATA|NEXT|
import java.util.NoSuchElementException;

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

  public void insertNodeInDLL(value) {
    ListNode newNode = new ListNode(value)
    if(isEmpty()) {
      tail = newNode
    } else {
      head.previous = newNode
    }
    newNode.next = head
    head = newNode
  }

  public void insertNodeAtEndInDLL(value) {
    // need to assign head and tail since null initially
    ListNode newNode = new ListNode(value)
    if(isEmpty()) {
      // if it is empty we want to set up the head to newNode and at the end of alg set newNode value to tail
      head = newNode
    } else {
      // create a pointer to new node forward
      tail.next = newNode
      // create a pointer to the previous node -> now pointer both ways
      newNode.previous = tail
    }
    // set newNode to tail since tail will be at the end of the list
    tail = newNode
  }
  public ListNode deleteFirstNodeInDLL() {
    if(isEmpty()) {
      throw new NoSuchElementException();
    }

    ListNode temp = head
    if( head == tail ){
      tail = null
    } else {
      head.next.previous = null 
    }
    head = head.next
    temp.next = null
    length--
    return temp
  }

  public ListNode deleteLastNodeInDLL() {
    if(isEmpty()) {
      throw new NoSuchElementException
    }  
    ListNode temp = tail
    if(head == tail) {
      head = null 
    } else {
      // remove the next pointer in the second last node
      tail.previous.next = null
    }
    // if only one node tail will point to null too and then can remove
    tail = tail.previous
    temp.previous = null
    length--;
    return temp 
  }

}

public static void main(String[] args) {
  DoublyLinkedList dll = new DoublyLinkedList();
  dll.insertNodeInDLL(1)
}

