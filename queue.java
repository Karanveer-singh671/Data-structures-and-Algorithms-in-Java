// linear data structure, insertion are done at one end called rear and deletion done at other end called front
// it is First elem inserted is first one to be deleted 
import java.util.NoSuchElementException;
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

  public int dequeue() {
    if(isEmpty()) {
      throw new NoSuchElementException("no element to remove")
    }
    // store the value you are removing in queue
    int result = front.data;
    // move reference pointer of front to the next ListNode since removed the reference to other node it will be garbage collected
    front = front.next
    // if moved front and points to null then there is only 1 element to remove 
    if(front == null) {
      // set rear to null and now no reference to only node in queue and garbage collected
      rear = null
    }
    length--
    return result
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

  public int first() {
    if(isEmpty()) {
      throw new NoSuchElementException("queue empty")
    } 
    return front.data
  }

  public int last() {
    if(isEmpty()) {
      throw new NoSuchElementException("queue empty")
    } 
    return rear.data
  }

  public static void main(String[], args) {
    Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);
    
    
  }
}