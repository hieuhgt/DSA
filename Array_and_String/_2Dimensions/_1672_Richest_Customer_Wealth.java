package Array_and_String._2Dimensions;

public class _1672_Richest_Customer_Wealth {
  public static int maximumWealth(int[][] a) {
    int numOfCustomers = a.length;
    int numOfBanks = a[0].length;
    int max = 0;
    // int[] sumOfWealth = new int[numOfCustomers];
    for (int i = 0; i < numOfCustomers; i++) {
      int sum = 0;
      for (int j = 0; j < numOfBanks; j++) {
        sum += a[i][j];
      }
      // sumOfWealth[i] = sum;
      if (sum > max) {
        max = sum;
      }
    }
    return max;
  }

  private static int max(int[] sumOfWealth) {
    int max = 0;
    for (int i = 0; i < sumOfWealth.length; i++) {
      if (sumOfWealth[i] > max) {
        max = sumOfWealth[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[][] accounts = { { 1, 2, 3 }, { 3, 2, 2 } };
    System.out.println(maximumWealth(accounts));
  }
}
