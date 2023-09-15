package Array_and_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _15_3Sum {

  // nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
  // nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
  // nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
  // The distinct triplets are [-1,0,1] and [-1,-1,2].
  // Notice that the order of the output and the order of the triplets does not
  // matter.
  // -4 -1 -1 0 1 2
  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    Set<List<Integer>> s = new HashSet<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      int j = i + 1;
      int k = nums.length - 1;
      while (j < k) {

        int sum = nums[i] + nums[j] + nums[k];
        if (sum == 0) {
          s.add(Arrays.asList(nums[i], nums[j], nums[k]));
          j++;
          k--;
        } else if (sum > 0) {
          k--;
        } else {
          j++;
        }
      }
    }
    ans.addAll(s);
    return ans;
  }

  // -4 -1 1 2
  public static int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int closestSum = nums[0] + nums[1] + nums[2];
    for (int i = 0; i < nums.length; i++) {
      int j = i + 1;
      int k = nums.length - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (Math.abs(sum - target) <= Math.abs(closestSum - target)) {
          closestSum = sum;
        }
        if (sum > target) {
          k--;
        } else {
          j++;
        }
      }
    }
    return closestSum;
  }

  public static void main(String[] args) {
    int[] arr = { -1, 2, 1, -4 };
    System.out.println(threeSumClosest(arr, 1));
  }
}
