package LinkedList;

import LinkedList._206_Reverse_Linked_List.ListNode;

public class _203_Remove_Linked_List_Elements {
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

  public static ListNode removeElements(ListNode head, int val) {
    if (head == null) {
      return null;
    }
    ListNode dummy = new ListNode();
    dummy.next = head;
    ListNode cur = head;
    ListNode prev = dummy;
    while (cur != null) {
      if (cur.val == val) {
        prev.next = cur.next;
      } else {
        prev = cur;
      }
      cur = cur.next;
    }
    return dummy.next;
  }

  public static void main(String[] args) {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(1);
    ListNode n3 = new ListNode(7);
    ListNode n4 = new ListNode(7);
    ListNode n5 = new ListNode(4);
    ListNode n6 = new ListNode(5);
    ListNode n7 = new ListNode(6);

    n1.next = n2;
    n2.next = n3;
    // n3.next = n4;
    // n4.next = n5;
    // n5.next = n6;
    // n6.next = n7;

    n1 = removeElements(n1, 1);
    printLinkedList(n1);
  }
}
