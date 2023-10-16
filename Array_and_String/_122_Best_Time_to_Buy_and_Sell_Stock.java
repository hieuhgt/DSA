package Array_and_String;

public class _122_Best_Time_to_Buy_and_Sell_Stock {
  public static int maxProfit(int[] prices) {
    int profits = 0;
    int buy = prices[0];
    int sell = 0;
    int sum = 0;
    for (int i = 0; i + 1 < prices.length; i++) {
      int j = i + 1;
      if (buy > prices[i]) {
        buy = prices[i];
      }
      if (prices[i] < prices[j]) {
        sell = prices[j];
        profits = sell - buy;
        sum += profits;
        buy = prices[j];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] arr = { 7, 6, 4, 3, 1 };
    System.out.println(maxProfit(arr));
  }
}
