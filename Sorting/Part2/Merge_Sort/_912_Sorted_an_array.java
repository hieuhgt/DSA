package Sorting.Part2.Merge_Sort;

import java.util.Arrays;

public class _912_Sorted_an_array {

  public static int[] merge(int[] a1, int[] a2) {
    int n = a1.length + a2.length;
    int[] result = new int[n];
    // i la con tro vao mang result, i1 la con tro vao mang a1, i2 la con tro vao
    // mang a2
    int i = 0, i1 = 0, i2 = 0;
    while (i < n) {
      if (i1 < a1.length && i2 < a2.length) { // a1 va a2 != rong
        if (a1[i1] <= a2[i2]) {
          result[i] = a1[i1];
          i++;
          i1++;
        } else {
          result[i] = a2[i2];
          i++;
          i2++;
        }
      } else { // a1 rong hoac a2 rong
        if (i1 < a1.length) {
          result[i] = a1[i1];
          i++;
          i1++;
        } else {
          result[i] = a2[i2];
          i++;
          i2++;
        }
      }
    }
    return result;
  }

  public static int[] mergeSort(int[] a, int l, int r) {
    // Truong hop dac biet
    if (l > r) {
      return new int[0];
    }
    if (l == r) {
      int[] singleElement = { a[l] };
      return singleElement;
    }
    // Truong hop tong quat
    // Chia ra
    System.out.println("Chia: " + l + " - " + r);
    int k = (l + r) / 2;
    int[] a1 = mergeSort(a, l, k);
    int[] a2 = mergeSort(a, k + 1, r);
    // Tron vao a2 va a1 la cac mang da duoc sap xep
    return merge(a1, a2);
  }

  public static int[] sortedArray(int[] nums) {
    return mergeSort(nums, 0, nums.length - 1);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 5, 3, 2, 8, 7, 6, 4 };
    System.out.println(Arrays.toString(sortedArray(arr)));
  }
}
