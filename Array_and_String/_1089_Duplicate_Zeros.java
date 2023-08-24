package Array_and_String;

import java.util.Arrays;

public class _1089_Duplicate_Zeros {
  // input: arr = [1,0,2,3,0,4,5,0] expected output: [1,0,0,2,3,0,0,4]
  public static void duplicateZeros(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == 0) {
        for (int j = a.length - 2; j >= i + 1; j--) {
          a[j + 1] = a[j];
        }
        if (i + 1 < a.length) {
          a[i + 1] = 0;
          i++;
        }
      }
    }
    System.out.println(Arrays.toString(a));
  }

  public static void main(String[] args) {
    int[] arr = { 0, 4, 1, 0, 0, 8, 0, 0, 3 };
    duplicateZeros(arr);
    System.out.println("DONE");
  }
}
