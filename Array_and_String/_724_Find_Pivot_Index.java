package Array_and_String;

import java.util.Arrays;

public class _724_Find_Pivot_Index {
  public static int pivotIndex(int[] nums) {
    int pivotIndex = -1;
    int[] leftArr = new int[nums.length];
    int[] rightArr = new int[nums.length];
    for (int i = 0; i < leftArr.length; i++) {
      if (i - 1 < 0) {
        leftArr[i] = nums[i];
      } else {
        leftArr[i] = leftArr[i - 1] + nums[i];
      }
    }
    for (int i = nums.length - 1; i >= 0; i--) {
      if (i + 1 > nums.length - 1) {
        rightArr[i] = nums[i];
      } else {
        rightArr[i] = rightArr[i + 1] + nums[i];
      }
    }
    System.out.println(Arrays.toString(leftArr));
    System.out.println(Arrays.toString(rightArr));
    for (int i = 0; i < nums.length; i++) {
      int left = 0;
      int right = 0;
      if (i == 0) {
        left = 0;
        if (i + 1 >= nums.length) {
          right = 0;
        } else {
          right = rightArr[i + 1];
        }
      } else if (i == nums.length - 1) {
        right = 0;
        left = leftArr[i - 1];
      } else {
        left = leftArr[i - 1];
        right = rightArr[i + 1];
      }
      if (left == right) {
        pivotIndex = i;
        break;
      }
    }

    return pivotIndex;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 7, 3, 6, 5, 6 };
    System.out.println(pivotIndex(arr));
  }
}
