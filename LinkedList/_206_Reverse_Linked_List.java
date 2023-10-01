package LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class _206_Reverse_Linked_List {
  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    public ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    public ListNode(int val) {
      this.val = val;
    }

  }

  public static void printLinkedList(ListNode head) {
    if (head == null) {
      System.out.println("List is empty");
    } else {
      ListNode temp = head;
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

  public static ListNode reverseList(ListNode head) {
    ListNode cur = head;
    while (cur != null && cur.next != null) {
      ListNode next = cur.next;
      cur.next = next.next;
      next.next = head;
      head = next;
    }
    return head;
  }

  public static void main(String[] args) {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(4);
    ListNode n5 = new ListNode(5);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    n1 = reverseList(n1);
    printLinkedList(n1);
  }
}
