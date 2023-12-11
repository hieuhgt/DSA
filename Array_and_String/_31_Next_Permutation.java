package Array_and_String;

import java.util.Arrays;

public class _31_Next_Permutation {
  static void nextPermutation(int[] a) {
    int largestKIndex = -1;
    int largestIIndex = 0;
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] < a[i + 1]) {
        largestKIndex = i;
      }
    }
    if (largestKIndex == -1) {
      reverse(a, 0);
      return;
    }
    for (int i = largestKIndex + 1; i < a.length; i++) {
      if (a[i] > a[largestKIndex]) {
        largestIIndex = i;
      }
    }
    int temp = a[largestKIndex];
    a[largestKIndex] = a[largestIIndex];
    a[largestIIndex] = temp;
    System.out.println(Arrays.toString(a));
    reverse(a, largestKIndex + 1);
    System.out.println(largestKIndex);
    System.out.println(largestIIndex);
  }

  static void reverse(int[] a, int startIndex) {
    if (a == null || startIndex < 0 || startIndex > a.length) {
      System.out.println("Invalid input");
      return;
    }
    int endIndex = a.length - 1;
    while (startIndex < endIndex) {
      int temp = a[startIndex];
      a[startIndex] = a[endIndex];
      a[endIndex] = temp;
      startIndex++;
      endIndex--;
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 5 };
    nextPermutation(nums);
    // reverse(nums, 0);
    System.out.println(Arrays.toString(nums));
  }
}