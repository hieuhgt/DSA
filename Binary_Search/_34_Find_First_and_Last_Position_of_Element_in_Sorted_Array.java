package Binary_Search;

import java.util.Arrays;

public class _34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
  public static int[] searchRange(int[] nums, int target) {
    int[] result = { -1, -1 };
    int l = 0;
    int r = nums.length - 1;
    while (l <= r) {
      int mid = (l + r) / 2;
      if (nums[mid] >= target) {
        l = mid + 1;
      } else if (nums[mid] < target) {
        l = mid;
      } else {
        r = mid - 1;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 8, 8, 8, 8, 10 };
    System.out.println(Arrays.toString(searchRange(arr, 8)));
  }
}
