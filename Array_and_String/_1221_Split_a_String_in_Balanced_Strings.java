package Array_and_String;

public class _1221_Split_a_String_in_Balanced_Strings {
  public static int balancedStringSplit(String s) {
    int left = 0;
    int right = 0;
    int count = 0;
    char[] a = s.toCharArray();
    if (a.length == 0) {
      return 0;
    }
    for (int i = 0; i < a.length; i++) {
      if (right == left) {
        count++;
      }
      if (a[i] == 'R') {
        right++;
      } else {
        left++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    String s1 = "RLRRLLRLRL"; // "RL", "RRLL", "RL", "RL"
    String s2 = "RLRRRLLRLL"; // "RL", "RRRLLRLL"
    String s3 = ""; // "LLLLRRRR"
    System.out.println(balancedStringSplit(s1));
    System.out.println(balancedStringSplit(s2));
    System.out.println(balancedStringSplit(s3));
  }
}
