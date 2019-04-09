// similar to singly linked list but difference is the last node points to the first node and not to null
// instead of head we keep track of last node in circular singly list 
// inserting at end it takes constant time since last pointer and last.next points to beginning of list 

public class CircularSinglyLinkedList {

  pirvate ListNode last;
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

  public static void main(String[], args) {
    CircularSinglyLinkedList csll = new CircularSinglyLinkedList()
  }
}