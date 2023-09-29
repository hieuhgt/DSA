package LinkedList;

public class MyLinkedList {

  /**
   * Node
   * Khong gan static in real life
   */
  public static class Node {
    int value;
    Node next;

    Node(int val) {
      this.value = val;
    }
  }

  public static void printLinkedList(Node head) {
    if (head == null) {
      System.out.println("List is empty");
    } else {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.value);
        temp = temp.next;
        if (temp != null) {
          System.out.print("->");
        } else {
          System.out.println();
        }
      }
    }
  }

  public static Node addToHead(Node headNode, int value) {
    Node newNode = new Node(value);
    if (headNode != null) {
      newNode.next = headNode;
    }
    return newNode;
  }

  public static Node addToTail(Node headNode, int value) {
    Node newNode = new Node(value);
    if (headNode == null) {
      return newNode;
    } else {
      // Xac dinh last node
      Node lastNode = headNode;
      while (lastNode.next != null) {
        lastNode = lastNode.next;
      }
      // Gan next cho lastNode
      lastNode.next = newNode;
    }
    return headNode;
  }

  public static Node addToIndex(Node headNode, int value, int index) {
    if (index == 0) {
      return addToHead(headNode, value);
    }
    // Tim vi tri can them
    Node newNode = new Node(value);
    Node curNode = headNode;
    int count = 0;
    while (curNode != null) {
      count++;
      if (count == index) {
        newNode.next = curNode.next;
        curNode.next = newNode;
        // Thuc hien add
        break;
      }
      curNode = curNode.next;
    }
    return headNode;
  }

  public static Node removeAtHead(Node headNode) {
    if (headNode != null) {
      return headNode.next;
    }
    return headNode;
  }

  public static Node removeAtTail(Node headNode) {
    if (headNode == null) {
      return null;
    }
    // B1 Xac dinh last va previous
    Node lastNode = headNode;
    Node prevNode = null;
    while (lastNode.next != null) { // lastNode la not cuoi thi lastNode.next = null
      prevNode = lastNode;
      lastNode = lastNode.next;
    }

    if (prevNode == null) {
      return null;
    } else {
      prevNode.next = null; // prevNode.next = lastNode.next
    }
    return headNode;
  }

  public static Node removeAtIndex(Node headNode, int index) {
    if (headNode == null || index < 0) {
      return null;
    }
    if (index == 0) {
      return removeAtHead(headNode);
    }
    Node prevNode = null;
    Node curNode = headNode;
    // Node nextNode = curNode.next;
    int count = 0;
    boolean bIsFound = false;
    while (curNode != null) {
      if (count == index) {
        bIsFound = true;
        break;
      }
      prevNode = curNode;
      curNode = curNode.next;
      count++;
    }
    if (bIsFound) {
      if (prevNode == null) { // current node is last node
        return null;
      } else {
        if (curNode != null) {
          prevNode.next = curNode.next;
        }
      }
    }
    return headNode;
  }
  // 1 -> 2-> 3 xoa index so 2
  // prevNode = 1, curNode = 2, count = 1 => prevNode = 2, curNode = 3, count = 2

  public static void main(String[] args) {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    n1.next = n2;
    n2.next = n3;
    // printLinkedList(n1);
    // Node newList = addToHead(n1, 0);
    // addToTail(newList, 5);
    // n1 = addToIndex(n1, 0, 0);
    printLinkedList(n1);
    n1 = removeAtIndex(n1, 0);
    printLinkedList(n1);
    n1 = removeAtIndex(n1, 1);
    printLinkedList(n1);
  }
}
