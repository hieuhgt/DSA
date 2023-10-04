package LinkedList;

public class _92_Reverse_Linked_List_2 {

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

  public static ListNode reverseBetween(ListNode head, int left, int right) {
    if (head == null || left > right) {
      return null;
    }
    if (left == right) {
      return head;
    }
    ListNode temp = new ListNode();
    temp.next = head;
    ListNode prevLeft = temp;
    int index = 1;
    while (index < left) {
      index++;
      prevLeft = prevLeft.next;
    }
    ListNode current = prevLeft.next;
    for (int i = 0; i < right - left; i++) {
      ListNode next = current.next;
      current.next = next.next;
      next.next = prevLeft.next;
      prevLeft.next = next;
    }

    return temp.next;
  }

  public static void main(String[] args) {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(4);
    ListNode n5 = new ListNode(5);
    ListNode n6 = new ListNode(6);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    // 1 -> 2 -> 3 -> 4 -> 5 -> 6
    // 1 -> 5 -> 4 -> 3 -> 2 -> 6
    ListNode newNode = reverseBetween(n1, 2, 5);
    printLinkedList(newNode);
  }
}
