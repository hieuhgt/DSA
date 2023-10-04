package LinkedList;

public class _141_Linked_List_Cycle {
  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public static boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }
    int step = 2;
    ListNode slow = head;
    ListNode fast = head.next;
    while (slow != null) {
      int count = 0;
      while (fast != null) {
        if (fast == slow) {
          return true;
        }
        fast = fast.next;
        count++;
        if (count == step) {
          break;
        }
      }
      slow = slow.next;

    }
    return false;
  }

  public static void main(String[] args) {
    ListNode n1 = new ListNode(3);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(0);
    ListNode n4 = new ListNode(-4);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    // n4.next = n2;
    System.out.println(hasCycle(n1));
  }
}
