package Sorting.Part1;

public class _414_Third_Maximum_Number {

  public static void printArray(long[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%d, ", arr[i]);
    }
    System.out.println();
  }

  public static void insert(long[] maxArr, int val) {
    int i = 0;
    while (i < maxArr.length) {
      if (val == maxArr[i]) {
        return;
      } else if (val > maxArr[i]) {
        break;
      } else { // val < maxArr[i]
        i++;
      }
    }
    // i = 0, j = 1
    if (i < maxArr.length) {
      // [MIN, MIN, MIN]
      for (int j = maxArr.length - 2; j >= i; j--) {
        maxArr[j + 1] = maxArr[j];
      }
      maxArr[i] = val;
    }
    printArray(maxArr);
  }

  public static int thirdMax(int[] a) {
    long[] maxArr = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };
    for (int i = 0; i < a.length; i++) {
      insert(maxArr, a[i]);
    }
    if (maxArr[2] == Long.MIN_VALUE) {
      return (int) maxArr[0];
    }
    return (int) maxArr[2];
  }

  public static void main(String[] args) {
    int[] a = { 2, 2, 3, 1 };
    System.out.println(thirdMax(a));
  }
}
