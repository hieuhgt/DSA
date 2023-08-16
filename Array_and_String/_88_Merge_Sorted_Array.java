package Array_and_String;

// Them chen phan tu vao mang
public class _88_Merge_Sorted_Array {
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int i : nums2) {
      chenPhanTuVaoMang(i, nums1, m);
      m++;
    }
  }

  // Con tro
  public static void merge2(int[] n1, int m, int[] n2, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = (m + n) - 1;

    while (k >= 0) {
      if (j < 0) {
        n1[k] = n1[i];
        i--;
      } else if (i < 0) {
        n1[k] = n2[j];
        j--;
      } else if (n1[i] > n2[j]) {
        n1[k] = n1[i];
        i--;
      } else {
        n1[k] = n2[j];
        j--;
      }
      k--;
    }
  }

  // x = 3, m = 4
  private static void chenPhanTuVaoMang(int x, int[] a, int m) {
    boolean isFoundedK = false;

    for (int k = 0; k < m; k++) {
      // k = 2 a[2] = 4 > 3
      if (a[k] > x) {
        isFoundedK = true;
        // i = 2, k = 2
        for (int i = m - 1; i >= k; i--) {
          a[i + 1] = a[i];
        }
        a[k] = x;
        break;
      }
    }
    if (!isFoundedK) {
      a[m] = x;
    }
  }

  public static void main(String[] args) {
    int[] n1 = { 2, 3, 4, 5, 0, 0, 0 };
    int[] n2 = { 0, 3, 6 };
    merge2(n1, 4, n2, 3);
    System.out.println("DONE");
  }
}
