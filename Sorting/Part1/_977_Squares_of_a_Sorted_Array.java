package Sorting.Part1;

import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {
  public static int[] sortedSquares(int[] a) {
    int[] result = new int[a.length];
    int n = result.length;
    // Found i
    int i = -1;
    while (i + 1 < n && a[i + 1] < 0) {
      i++;
    }
    // Found j
    int j = n;
    while (j - 1 >= 0 && a[j - 1] >= 0) {
      j--;
    }
    int k = 0;
    while (i >= 0 || j < n) {
      if (i >= 0 && j < n) {
        int ii = a[i] * a[i];
        int jj = a[j] * a[j];
        if (ii <= jj) {
          result[k] = ii;
          i--;
          k++;
        } else {
          result[k] = jj;
          j++;
          k++;
        }
      } else if (i >= 0) {
        result[k] = a[i] * a[i];
        i--;
        k++;
      } else { // j < n
        result[k] = a[j] * a[j];
        j++;
        k++;
      }
    }
    return result;
  }

  public static int[] sortedSquares2(int[] a) {
    int left = 0;
    int right = a.length - 1;
    int[] result = new int[a.length];
    int index = a.length - 1;
    while (left <= right) {
      int leftSquare = a[left] * a[left];
      int rightSquare = a[right] * a[right];
      if (leftSquare > rightSquare) {
        result[index] = leftSquare;
        left++;
      } else {
        result[index] = rightSquare;
        right--;
      }
      index--;
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = { -4, -1, 0, 3, 10 };
    System.out.println(Arrays.toString(sortedSquares2(arr)));

  }
}
