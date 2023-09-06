package Array_and_String;

import java.util.Arrays;

// 905 724 66
public class _905_Sort_Array_By_Parity {
  public static int[] sortArrayByParity(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      if (nums[left] % 2 != 0 && nums[right] % 2 == 0) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
      } else if (nums[left] % 2 == 0) {
        left++;
      } else {
        right--;
      }
    }
    return nums;
  }

  public static void main(String[] args) {
    int[] arr = { 3, 1, 2, 4 };
    System.out.println(Arrays.toString(sortArrayByParity(arr)));
    System.out.println("DONE");
  }
}
