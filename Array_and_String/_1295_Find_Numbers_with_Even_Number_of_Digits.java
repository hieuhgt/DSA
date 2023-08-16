package Array_and_String;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {
  public static int findNumbers(int[] nums) {
    int count = 0;
    for (int i : nums) {
      int numOfDigit = countNumOfDigit(i);
      if (numOfDigit % 2 == 0) {
        count++;
      }
    }
    return count;
  }

  private static int countNumOfDigit(int a) {
    int value = a;
    int count = 0;
    while (value != 0) {
      value = a / 10;
      a = value;
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = { 555, 901, 482, 1771 };
    System.out.println(findNumbers(arr));
  }
}
