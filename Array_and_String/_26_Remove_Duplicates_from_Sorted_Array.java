package Array_and_String;

public class _26_Remove_Duplicates_from_Sorted_Array {
  public static int removeDuplicates(int[] a) {
    int curIndex = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] != a[curIndex]) {
        curIndex++;
        a[curIndex] = a[i];
      }
    }
    return curIndex + 1;
  }

  public static void main(String[] args) {
    int[] arr = { 0, 0, 1, 1 };
    // 0 1 1 1 2 2 3 3 4 4
    // 0 1 1 2 2 3 3 4 4 4
    System.out.println(removeDuplicates(arr));
    System.out.println("DONE");
  }
}
