package LinkedList;

public class _160_Intersection_of_Two_Linked_Lists {
  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public static int count(ListNode head) {
    int count = 0;
    while (head != null) {
      count++;
      head = head.next;
    }
    return count;
  }

  public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }
    int lenA = count(headA);
    int lenB = count(headB);
    if (lenA > lenB) {
      while (lenA > lenB) {
        headA = headA.next;
        lenA--;
      }
    } else if (lenB > lenA) {
      while (lenB > lenA) {
        headB = headB.next;
        lenB--;
      }
    }
    while (headA != null && headB != null) {
      if (headA == headB) {
        return headA;
      }
      headA = headA.next;
      headB = headB.next;
    }
    return null;
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

  public static void main(String[] args) {
    ListNode n1 = new ListNode(4);
    ListNode n2 = new ListNode(1);
    ListNode n3 = new ListNode(5);
    ListNode n4 = new ListNode(6);
    ListNode n5 = new ListNode(1);
    ListNode n6 = new ListNode(8);
    ListNode n7 = new ListNode(4);
    ListNode n8 = new ListNode(5);
    // List A 4 1 8 4 5
    n1.next = n2;
    n2.next = n6;
    n6.next = n7;
    n7.next = n8;
    // List B 5 6 1 8 4 5
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    n6.next = n7;
    n7.next = n8;

    ListNode n = getIntersectionNode(n1, n3);
    printLinkedList(n);
  }
}
