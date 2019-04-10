public class SinglyLinkedList {
  import java.lang.IllegalArgumentException
  private ListNode head; // instance variable type ListNode, need to create
  // class can't be changed if static class 
  private static class ListNode {
    private int data; // generic type but will use as int type 
    private ListNode next;


    // constructor 
    // every list node has these properties so when create can set to data and after set the next pointer
    public ListNode(int data) {
        this.data = data;
        this.next = null
        // initially pointing to null until set a reference to the next node 
    }
  }

  public void display() {
    ListNode current = head
    while(current != null) {
      System.out.print(current.data + " --> ")
      current = current.next
    }
    System.out.print("null")
  }

  public void length() {
    if(head == null) {
      return 0
    }
    int counter = 0
    ListNode current = head 
    while(current != null) {
      counter++;
      current = current.next
  }
  return counter
}

  public void insertBeginning(int value) {
    // new node created with value and next pointing to null 
    ListNode newNode = new ListNode(value);
    // insert to beginning point to head so next points to head now 
    newNode.next = head
    // head to be at beginning of singly linked list so set the newNode which is now at the beginning to head
    head = newNode

  }

  public void insertEnd(int value) {
    ListNode newNode = new ListNode(value)
    if(head == null) {
      // no head so set newNode as the head 
      head = newNode
      return
    }
    ListNode current = head
    while (null != current.next) {
      // move to next node in SLL
        current = current.next
    }
    // once current.next is null we have reached the end of the list so set the current.next to point to the newNode and it will be at the end 
    current.next = newNode
  }

  public boolean search(int searchKey) {
    if (head == null) {
      return false
    }
    ListNode current = head 
    while(current != null) {
      if(current.data == searchKey) {
        return true
      }
      current = current.next
    }
    return false 
  }
  // return type is ListNode
  // Video 22 
  public ListNode reverseLinkedList(ListNode head) {
    if(head == null) {
      return head;
    }
    ListNode current = head;
    ListNode previous = null
    ListNode next = null
    // while we haven't reached the end of the linked list
    while (current != null) {
      // set the next node to next
      next = current.next
      // store the previous in current.next now breaks the pointer and points to null in first iteration
      // second iteration the next pointer will point 
      current.next = previous
      // now previous stores the current value and will be the new head
      previous = current 
      // now next is stored in current 
      current = next 
    }
    return previous
  }

  public ListNode getMiddleNode() {
      if (head == null) {
        return null
      }

      ListNode slowptr = head
      ListNode fastptr = head

      while (fastptr != null && fastptr.next != null) {
        slowptr = slowptr.next
        fastptr = fastptr.next.next
      }
      return slowptr
  }

  public ListNode getNthFromEnd(n) {
    if (head == null) {
      return null
    }
    if (n <= 0) {
      throw new IllegalArgumentException("invalid value of" + n)
    }
    ListNode mainPtr = head
    ListNode refPtr = head

    int count = 0;

    while(count < n) {
      if (refPtr == null) {
        throw new IllegalArgumentException(n + "is greater than number of nodes in SinglyLinkedList")
      }
      refPtr = refPtr.next
      count++
    }
    while(refPtr != null) {
      refPtr = refPtr.next
      mainPtr = mainPtr.next
    }
    return mainPtr
  }

  public void removeDuplicates() {
    if(head == null) {
      return
    }
    ListNode current = head
    while (current != null && current.next != null) {
      if (current.data == current.next.data) {
        // set reference pointer of next to the node after skipping the next one which removes the duplicate and since it gets garbage collected since no pointer
        current.next = current.next.next
      }
      else {
        // else increment to next node 
        current = current.next
      }
    }
  }

  public void insertNodeInSortedList(int value) {
    ListNode newNode = new ListNode(value);
     // if head null then insert new node we just want to return it
    if(head == null) {
      return newNode
    }
    
    ListNode current = head;
    ListNode temp = null
    // when the current data is greater than the new node data stop the loop
    while(current != null && current.data < newNode.data) {
      temp = current 
      current = current.next
    }
    // temp will be one behind current
    // insert newNode to point to current and temp next to point to newNode then return the head 
    newNode.next = current
    temp.next = newNode
    return head
  }
}

  public void deleteNode(int key) {
    ListNode current = head
    ListNode temp = null

    if(current != null && current.data == key) {
      // set head value to one node after current i.e the node to be deleted loses reference and gets garbage collected
      head = current.next
      return
    }
    while(current != null && current.data != key) {
      temp = current 
      current = current.next
    }
    if(current == null) {
      return
    }
    // remove the node so previous node to current just set to skip the node pointer to point to the node after then garbage collected
    temp  = current.next
  }

  public void detectLoop() {
    if (head == null) {
      return false
    }
    ListNode fastPtr = head
    ListNode slowPtr = head

    while(fastPtr != null && fastPtr.next != null) {
      fastPtr = fastPtr.next.next
      slowPtr = slowPtr.next
      // with loop nature eventually if there is fastPtr will == slowPrt and thus loop
      if(fastPtr == slowPtr) {
        return true
      }
    }
    return false
  }

  public void createALoopInLinkedList() {
    ListNode node1 = new ListNode(1)
    ListNode node2 = new ListNode(2)
    ListNode node3 = new ListNode(3)
    ListNode node4 = new ListNode(4)
    ListNode node5 = new ListNode(5)
    ListNode node6 = new ListNode(6)

    head = node1
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6
    node6.next = node3

  }

  public static void main(String[] args) {
    SinglyLinkedList sll = new SinglyLinkedList();

    sll.createALoopInLinkedList()
    System.out.println(sll.detectLoop())
  //   sll.head = new ListNode(10)
  //   ListNode second = new ListNode(1)
  //   ListNode third = new ListNode(2)
  //   ListNode four = new ListNode(4)

  //   // connect them together now to form a chain currently head pointed to null so change 
  //   sll.head.next = second;
  //   second.next = third;
  //   third.next = fourth;
  //   // fourth.next is already null and should be since it is the end of the singly linked list so no need to assign
  //   // 10 --> 1 --> 2 --> 4 --> null

  //   sll.display()
  //   System.out.print("length is - " + sll.length())
  // }
