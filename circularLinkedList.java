// similar to singly linked list but difference is the last node points to the first node and not to null
// instead of head we keep track of last node in circular singly list 
// inserting at end it takes constant time since last pointer and last.next points to beginning of list 
import java.lang.System;
import java.util.NoSuchElementException;
public class CircularSinglyLinkedList {

  private ListNode last;
  private int length;

  private class ListNode {
    private ListNode next;
    private int data;
    
    public ListNode(int data) {
      this.data = data;
    }
  }

  public CircularSinglyLinkedList(){
      last = null
      length = 0
  }

  public int length() {
    return length
  }

  public boolean isEmpty() {
    return length == 0
  }
  // no return statement so use void
  public void createCircularLinkedList(){
    ListNode first = new ListNode(1)
    ListNode second = new ListNode(2)
    ListNode third = new ListNode(3)
    ListNode fourth = new ListNode(4)
    ListNode fifth = new ListNode(5)

    first.next = second
    second.next = third
    third.next = fourth
    fourth.next = fifth
    // make circular
    fifth.next = first
    // last pointer set to first so circular
    last = first
  }

  public void display() {
    // csll empty
    if(last == null) {
      return
    }
    // first position, we know last.next points to first node in csll
    ListNode first = last.next
    while(first != last ) {
      System.out.print(first.data + " ")
      first = first.next
    }
    System.out.print(first.data)
  }

  public void insertNodeBeginningCSLL(int value){
    ListNode temp = new ListNode(value)
    if(last == null) {
      last = temp 
    } else {
      temp.next = last.next
    }
    last.next = temp
    length++
  }

  public void insertNodeAtEndOfCSLL(int value){
    ListNode temp = new ListNode(value)
    if (last == null) { // empty list
      last = temp
      // points to itself Circular
      last.next = last
    } else {
      temp.next = last.next
      last.next = temp
      last = temp
    }
    length++
  }

  public ListNode removeNodeCSLL(){
    if(isEmpty()) {
      throw new NoSuchElementException
    }
    ListNode temp = last.next
    if(last.next != last) {
      last.next = temp.next
    } else {
      // only 1 node so set last to null to remove 
      last = null 
    }
    temp.next = null
    length--;
    return temp;
  }

  public static void main(String[], args) {
    CircularSinglyLinkedList csll = new CircularSinglyLinkedList()
    csll.createCircularLinkedList();
    // csll.insertNodeBeginningCSLL(10)
    csll.insertNodeAtEndOfCSLL(10)
    csll.display()
  }
}