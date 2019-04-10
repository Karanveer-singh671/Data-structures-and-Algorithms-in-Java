// linear data structure can be represented by linkedList or an array
// stack is ordered list in which insertion and deletion are done at one end (called the top),
// the last element inserted is first one to be deleted (LIFO)
import java.util.EmptyStackException;
public class Stack {
    private ListNode top;
    private int length;

    private class ListNode {
      private int data;
      private ListNode next;

      public ListNode(int data) {
          this.data = data;
      }
    }

    public Stack() {
      top = null;
      length = 0
    }

    public int length() {
      return length;
    }

    public boolean isEmpty() {
      return length == 0
      }
    }

    public void push(int data) {
      ListNode temp = new ListNode(10);
      // sets new node's pointer to null initially
      temp.next = top
      // set the top of the stack to be the node pushing in the stack
      top = temp
      length++
    }

    public int pop() {
      if(isEmpty()) {
        throw new EmptyStackException()
      }

      int result = top.data
      top = top.next;
      length--
      return result
    }

    public int peak() {
      if(isEmpty()) {
        throw new EmptyStackException()
      }
      // return the value at the top of the stack
      return top.data
    }

    public static void main(String[], args) {
      Stack stack = new Stack();
      stack.push(10)
      stack.push(11)
      stack.push(14)
    }
