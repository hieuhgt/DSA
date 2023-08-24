package Array_and_String;

import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {
  public static int[] sortedSquares(int[] a) {
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] * a[i];
    }
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] > a[j]) {
          int tmp = a[i];
          a[i] = a[j];
          a[j] = tmp;
        }
      }
    }
    return a;
  }

  public static void main(String[] args) {
    int[] arr = { -4, -1, 0, 3, 10 };
    System.out.println(Arrays.toString(sortedSquares(arr)));
  }
}
