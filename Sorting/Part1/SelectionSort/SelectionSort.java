package Sorting.Part1.SelectionSort;

public class SelectionSort {

  public static void main(String[] args) {
    int[] a = { 5, 3, 2, 7, 8, 1, 2 };
    selectionSort(a);
    System.out.println("DONE");
  }

  private static void selectionSort(int[] a) {
    for (int i = 0; i < a.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < a.length; j++) {
        // find min [i,n]
        if (a[j] < a[minIndex]) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        int temp = a[i];
        a[i] = a[minIndex];
        a[minIndex] = temp;
      }
    }
  }
}
