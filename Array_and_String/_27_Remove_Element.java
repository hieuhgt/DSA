package Array_and_String;

public class _27_Remove_Element {
  public static int removeElement(int[] a, int val) {
    int n = a.length;
    // n = 3, i = 0
    for (int i = 0; i < n;) {
      if (a[i] == val) {
        // n = 4, j = 2, j < 3
        for (int j = i; j < n - 1; j++) {
          a[j] = a[j + 1];
        }
        n--;
      } else { // Ko phai xoa
        i++;
      }
    }
    return n;
  }

  public static int removeElement2(int[] a, int val) {
    int k = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] != val) {
        a[k] = a[i];
        k++;
      }
    }
    return k;
  }

  public static void main(String[] args) {
    // {3, 2, 3, 3}
    // i = 1 => j = 4; n = 6 => j < 5
    // {3, 2, 3, 4, 2, 2}
    int[] arr = { 3, 2, 2, 3, 4 };
    System.out.println(removeElement(arr, 2));
  }
}
