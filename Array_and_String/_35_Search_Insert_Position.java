package Array_and_String;

public class _35_Search_Insert_Position {
  public static int searchInsert(int[] nums, int target) {
    int targetIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (target > nums[i]) {
        targetIndex++;
      }
    }
    return targetIndex;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 6 };
    System.out.println(searchInsert(arr, 7));
  }
}
