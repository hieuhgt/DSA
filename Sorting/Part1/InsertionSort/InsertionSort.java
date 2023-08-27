package Sorting.Part1.InsertionSort;

public class InsertionSort {
  public static void insertionSort(int[] a) {
    for (int i = 1; i < a.length; i++) {
      int ai = a[i];
      int j = i - 1;
      while (j >= 0 && a[j] > ai) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = ai;
    }
  }

  public static void main(String[] args) {
    int[] a = { 5, 3, 2, 7, 8, 1, 2 };
    int[] b = { 1, 2, 3, 4, 5, 7, 6 };
    insertionSort(a);
    System.out.println("DONE");
  }
}
