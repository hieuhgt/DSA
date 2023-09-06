package Array_and_String;

import java.util.Arrays;

public class _66_Plus_One {
  public static int[] plusOne(int[] digits) {
    // Hoac la lay so du

    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }

    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 2, 2, 6, 5, 7, 1, 9, 0, 3, 8, 6, 8, 6, 5, 2, 1, 8, 7, 9, 8, 3, 8, 4, 7, 2, 5, 8, 9 };
    int[] res = plusOne(arr);
    // System.out.println(562004624 * 10);
    System.out.println(Arrays.toString(res));
  }
}
