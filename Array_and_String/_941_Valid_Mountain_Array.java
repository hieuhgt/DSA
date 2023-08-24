package Array_and_String;

public class _941_Valid_Mountain_Array {
  public static boolean validMountainArray(int[] a) {
    boolean bIsIncrease = true;
    if (a.length < 3) {
      return false;
    }
    for (int i = 0; i + 1 < a.length; i++) {
      int j = i + 1;
      if (a[i] > a[j]) {
        if (bIsIncrease) {
          if (i == 0) {
            return false;
          }
          bIsIncrease = false;
        }
      } else if (a[i] < a[j]) {
        if (bIsIncrease == false) {
          return false;
        }
      } else {
        return false;
      }
    }
    return bIsIncrease ? false : true;
  }

  public static void main(String[] args) {
    int[] arr = { 0, 2, 3, 1, 5, 2, 0 };
    System.out.println(validMountainArray(arr));
  }
}
