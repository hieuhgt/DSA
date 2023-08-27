package Sorting.Part1.BubbleSort;

public class BubbleSort {
  public static void bubbleSort(int[] a) {
    for (int i = 0; i < a.length; i++) {
      boolean isSorted = true;
      for (int j = 0; j < a.length - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          isSorted = false;
          int tmp = a[j + 1];
          a[j + 1] = a[j];
          a[j] = tmp;
        }
      }
      if (isSorted) {
        break;
      }
    }
  }

  public static void main(String[] args) {
    int[] a = { 5, 3, 2, 7, 8, 1, 2 };
    int[] b = { 1, 2, 3, 4, 5, 7, 6 };
    bubbleSort(b);
    System.out.println("DONE");
  }
}
