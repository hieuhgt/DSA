package Sorting.Part2.Quick_Sort;

public class MyQuickSort {
  static void quickSort(int[] a, int l, int r) {
    if (l >= r) {
      return;
    }
    // B1: Chon khoa
    int key = a[(l + r) / 2];
    // B2: Phan bo lai mang theo khoa
    int pivot = partition(a, l, r, key);
    // B3: Chia doi mang => Lap lai
    quickSort(a, l, pivot - 1);
    quickSort(a, pivot, r);
  }

  // return pivot value
  static int partition(int[] a, int l, int r, int key) {
    int iL = l;
    int iR = r;
    while (iL <= iR) {
      // Voi iL, di tim phan tu >= key
      while (a[iL] < key) {
        iL++;
      }
      // Voi iR, di tim phan tu <= key
      while (a[iR] > key) {
        iR--;
      }
      // Doi cho 2 phan tu dang dung ko dung vi tri
      if (iL <= iR) {
        int temp = a[iL];
        a[iL] = a[iR];
        a[iR] = temp;
        iL++;
        iR--;
      }
    }
    return iL;
  }

  public static void main(String[] args) {
    int[] a = { 6, 7, 8, 5, 4, 1, 2, 3 };
    quickSort(a, 0, a.length - 1);
    System.out.println();
  }
}
