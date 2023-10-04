package LinkedList;

public class _234_Palindrome_Linked_List {

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

  public static int count(ListNode head) {
    int count = 0;
    while (head != null) {
      count++;
      head = head.next;
    }
    return count;
  }

  public static ListNode reverse(ListNode head) {
    ListNode cur = head;

    while (cur != null && cur.next != null) {
      ListNode next = cur.next;
      cur.next = next.next;
      next.next = head;
      head = next;
    }
    return head;
  }

  public static boolean isPalindrome(ListNode head) {
    int n = count(head);
    if (n == 1) {
      return true;
    }
    int k = n / 2;
    int index = 0;
    ListNode curNode = head;
    while (curNode != null) {
      if (index == (n % 2 == 0 ? k : k + 1)) {
        break;
      }
      index++;
      curNode = curNode.next;
    }
    ListNode the2ndList = reverse(curNode);
    index = 0;
    while (index < k) {
      index++;
      if (head.val != the2ndList.val) {
        return false;
      }
      head = head.next;
      the2ndList = the2ndList.next;
    }
    return true;
  }

  public static void main(String[] args) {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(23);
    // ListNode n4 = new ListNode(1);
    n1.next = n2;
    n2.next = n3;
    System.out.println(count(n1));
    // n3.next = n4;
    System.out.println(isPalindrome(n1));
  }
}
