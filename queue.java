// linear data structure, insertion are done at one end called rear and deletion done at other end called front
// it is First elem inserted is first one to be deleted 

public class Queue {
  // instance variables these are the pointers we need 
  private ListNode front;
  private ListNode rear;
  private int length;

  private class ListNode {
    // instance variables making up a ListNode
    private int data;
    private ListNode next;
    // construct ListNode
    public ListNode(int data) {
      this.data = data
      this.next = null
    }
  }

  public Queue() {
    this.front = null
    this.rear = null
    length = 0
  }

  public int length() {
    return length;
  }

  public boolean isEmpty() {
    return length == 0
  }

  public void enqueue(int value) {
    ListNode temp = new ListNode(value)
    if(isEmpty()) {
      front = temp
    } else {
      rear.next = temp
    }
    rear = temp; 
    length++
  }

  public void print() {
    if(isEmpty()) {
      return
    } 
    ListNode current = front;
    while(current!= null) {
      System.out.println(current.data + " -->")
      current = current.next
    }
    System.out.println("null")
  }


  public static void main(String[], args) {

  }
}