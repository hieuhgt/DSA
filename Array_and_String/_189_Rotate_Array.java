package Array_and_String;

import java.util.Arrays;

public class _189_Rotate_Array {

  public static void reverse(int[] nums, int left, int right) {
    while (left < right) {
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
    }
  }

  public static void rotate(int[] nums, int k) {
    k %= nums.length;
    System.out.println(k);
    int n = nums.length;
    if (k == 0 || k > n) {
      return;
    }
    reverse(nums, 0, n - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, n - 1);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2 };
    rotate(arr, 3);
    System.out.println(Arrays.toString(arr));
  }
}
