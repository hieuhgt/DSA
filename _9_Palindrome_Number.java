public class _9_Palindrome_Number {
  public static boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int temp = x;
    int reverse = 0;
    while (temp != 0) {
      int lastDigit = temp % 10;
      reverse = reverse * 10 + lastDigit;
      temp /= 10;
    }
    return reverse == x;
  }

  public static void main(String[] args) {
    int x = -121;
    System.out.println(isPalindrome(x));
  }
}
