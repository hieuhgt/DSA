package Sorting.Part1;

public class _1051_Height_Checker {
  public static int heightChecker(int[] heights) {
    int count = 0;
    int[] copied = new int[heights.length];
    for (int i = 0; i < copied.length; i++) {
      copied[i] = heights[i];
    }
    for (int i = 0; i < copied.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < copied.length; j++) {
        if (copied[j] < copied[minIndex]) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        int temp = copied[i];
        copied[i] = copied[minIndex];
        copied[minIndex] = temp;
      }
    }
    for (int i = 0; i < copied.length; i++) {
      if (copied[i] != heights[i]) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 1, 2, 3, 4 };
    System.out.println(heightChecker(arr));
  }
}
