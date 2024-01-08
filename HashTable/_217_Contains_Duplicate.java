package HashTable;

import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {
  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> mySet = new HashSet<>();
    for (Integer inpuInteger : nums) {
      if (mySet.contains(inpuInteger)) {
        return true;
      } else {
        mySet.add(inpuInteger);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1 };
    int[] arr1 = { 1, 2, 3, 4 };
    int[] arr2 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
    System.out.println(containsDuplicate(arr));
    System.out.println(containsDuplicate(arr1));
    System.out.println(containsDuplicate(arr2));
  }
}
