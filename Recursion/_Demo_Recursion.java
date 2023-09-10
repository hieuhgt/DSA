package Recursion;

public class _Demo_Recursion {
  public static int factorial(int n) {
    // Bai toan co so
    if (n == 0) {
      return 1;
    }
    // cong thuc quy nap
    int t = n * factorial(n - 1);
    return t;
  }

  public static int fibonaci(int n) {
    if (n <= 2) {
      return 1;
    }
    return fibonaci(n - 1) + fibonaci(n - 2);
  }

  static int[] F = new int[1000];

  // DE QUY CO NHO
  public static int fibonaci2(int n) {
    if (F[n] != 0) {
      return F[n];
    }
    if (n <= 2) {
      F[1] = 1;
      F[2] = 1;
      return 1;
    }
    F[n] = fibonaci2(n - 1) + fibonaci2(n - 2);
    return F[n];
  }

  public static void printElement(int[] arr, int index) {
    // bai toan co so
    if (index < 0 || index >= arr.length) {
      return;
    }
    // Cong thuc quy nap // Doi vi tri cho nhau thi se la thuc hien cong viec trc
    // hoac thuc hien cong viec sau
    printElement(arr, index + 1);
    System.out.println(arr[index]);
  }

  public static void main(String[] args) {
    // System.out.println(fibonaci(5));
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    // printElement(arr, 0);

    int[] Fibo = new int[11];
    Fibo[1] = 1;
    Fibo[2] = 1;
    for (int i = 3; i <= 10; i++) {
      Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
    }
    System.out.println(Fibo[10]);
  }
}
