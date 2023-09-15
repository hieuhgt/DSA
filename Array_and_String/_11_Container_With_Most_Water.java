package Array_and_String;

public class _11_Container_With_Most_Water {
  public static int maxArea(int[] a) {
    int left = 0; // 1
    int right = a.length - 1; // 8
    int maxArea = 0;
    while (left < right) {
      int height = Math.min(a[left], a[right]);
      int currentArea = height * (right - left);
      if (currentArea > maxArea) {
        maxArea = currentArea;
      }
      if (a[left] < a[right]) {
        left++;
      } else if (a[left] >= a[right]) {
        right--;
      }
    }
    return maxArea;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 1 };
    System.out.println(maxArea(arr));
  }
}
