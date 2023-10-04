package LinkedList;

public class _21_Merge_Two_Sorted_Lists {
  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
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

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode();
    ListNode cur = dummy;

    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        cur.next = list1;
        list1 = list1.next;
      } else {
        cur.next = list2;
        list2 = list2.next;
      }
      cur = cur.next;
    }
    cur.next = list1 == null ? list2 : list1;
    return dummy.next;
  }

  public static void main(String[] args) {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(4);
    ListNode n4 = new ListNode(1);
    ListNode n5 = new ListNode(3);
    ListNode n6 = new ListNode(4);

    n1.next = n2;
    n2.next = n3;

    n4.next = n5;
    n5.next = n6;

    ListNode newNode = mergeTwoLists(n1, n4);
    printLinkedList(newNode);
  }
}
