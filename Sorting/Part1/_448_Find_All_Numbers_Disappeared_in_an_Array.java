package Sorting.Part1;

import java.util.ArrayList;
import java.util.List;

public class _448_Find_All_Numbers_Disappeared_in_an_Array {
  public static List<Integer> findDisappearedNumbers(int[] nums) {
    // 1 2 2 3 4 4 7
    List<Integer> result = new ArrayList<>();
    boolean[] exist = new boolean[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
      exist[nums[i]] = true;
    }
    for (int i = 1; i < exist.length; i++) {
      if (!exist[i]) {
        result.add(i);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    // B1: Sort: 1 2 2 3 3 4 7 8
    // [1, 2, 3, 4, _, _, 7, 8]
    int[] arr = { 1, 1 };
    System.out.println(findDisappearedNumbers(arr));
  }
}
