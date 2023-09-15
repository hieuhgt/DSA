package Binary_Search;

public class MyBinarySearch {
  public static int binarySearch(int[] a, int key) {
    int n = a.length;
    int left = 0;
    int right = n - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (a[mid] == key) {
        return mid;
      } else if (a[mid] < key) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }

  public static int binarySearchRecursion(int[] a, int key, int iLeft, int iRight) {
    if (iLeft <= iRight) {
      int mid = (iLeft + iRight) / 2;
      if (key == a[mid]) {
        return mid;
      } else if (a[mid] > key) {
        return binarySearchRecursion(a, key, iLeft, iRight - 1);
      } else {
        return binarySearchRecursion(a, key, iLeft + 1, iRight);
      }
    }
    return -1;
  }

  public static int binarySearchRecursion(int[] a, int key) {
    int n = a.length;
    return binarySearchRecursion(a, key, 0, n - 1);
  }

  public static int maximumCount(int[] nums) {
    int negative = 0;
    int positive = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        positive++;
      } else if (nums[i] < 0) {
        negative++;
      }
    }
    return positive > negative ? positive : negative;
  }

  public static void main(String[] args) {
    // int[] arr = { 1, 4, 9, 12, 19, 25, 31, 46, 50, 57, 72 };
    // System.out.println(binarySearchRecursion(arr, 31));

    int[] arr1 = { 5, 20, 66, 1314 };
    System.out.println(maximumCount(arr1));
  }
}
