package Array_and_String;

import java.util.Arrays;
import java.util.HashMap;

public class _169_Majority_Element {
  public static int majorityElement(int[] nums) {
    int majorityTimes = 0;
    int result = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.put(nums[i], map.get(nums[i]) + 1);
      } else {
        map.put(nums[i], 1);
      }
      // map.put(nums[i], map.get(nums[i]) != null + 1);
    }
    for (int key : map.keySet()) {
      int times = map.get(key);
      if (majorityTimes < times) {
        majorityTimes = times;
        result = key;
      }
    }
    return result;
  }

  public static int majorityElement2(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    return nums[n / 2];
  }

  public static void main(String[] args) {
    int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
    System.out.println(majorityElement(arr));
  }
}
