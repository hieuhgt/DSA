package LinkedList;

public class _328_Odd_Even_Linked_List {
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

  public static ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    int index = 1;
    ListNode cur = head;

    ListNode odd = null;
    ListNode even = null;
    while (cur != null) {
      ListNode nextNode = cur.next;
      if (index == 1) {
        odd = cur;
      } else if (index == 2) {
        even = cur;
      }

      if (index > 2) {
        if (index % 2 != 0) {
          cur.next = odd.next;
          odd.next = cur;
          even.next = nextNode;
        } else {
          odd = odd.next;
          even = even.next;
        }
      }
      index++;
      cur = nextNode;
    }
    return head;
  }

  public static void main(String[] args) {
    ListNode n1 = new ListNode(2);
    ListNode n2 = new ListNode(1);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(5);
    ListNode n5 = new ListNode(6);
    ListNode n6 = new ListNode(4);
    ListNode n7 = new ListNode(7);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    n6.next = n7;

    ListNode newNode = oddEvenList(n1);
    printLinkedList(newNode);
  }
}
