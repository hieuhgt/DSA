package LinkedList;

import java.util.HashMap;

public class _138_Copy_List_with_Random_Pointer {
  static class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
      this.val = val;
      this.next = null;
      this.random = null;
    }
  }

  public static void printLinkedList(Node head) {
    if (head == null) {
      System.out.println("List is empty");
    } else {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.val);
        temp = temp.next;
        if (temp != null) {
          System.out.print("->");
        } else {
          System.out.println();
        }
      }
    }
  }

  public static Node copyRandomList(Node head) {

    if (head == null) {
      return null;
    }
    HashMap<Node, Node> oldToNew = new HashMap<>();
    Node cur = head;
    while (cur != null) {
      oldToNew.put(cur, new Node(cur.val));
      cur = cur.next;
    }

    cur = head;
    while (cur != null) {
      oldToNew.get(cur).next = oldToNew.get(cur.next);
      oldToNew.get(cur).random = oldToNew.get(cur.random);
      cur = cur.next;
    }
    return oldToNew.get(head);

  }

  public static void main(String[] args) {
    Node n1 = new Node(7);
    Node n2 = new Node(13);
    Node n3 = new Node(11);
    Node n4 = new Node(10);
    Node n5 = new Node(1);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    n1.random = n5.next;
    n2.random = n1;
    n3.random = n5;
    n4.random = n3;
    n5.random = n1;
    System.out.println("Original List");
    printLinkedList(n1);
    System.out.println("Clone List");
    Node clNode = copyRandomList(n1);
    printLinkedList(clNode);
  }
}
