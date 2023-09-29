package Array_and_String.String_Character_char;

public class _6_Zigzag_Conversion {
  public static String convert(String s, int numRows) {
    int row = 0;
    boolean down = false;
    int n = s.length();
    String result = "";
    String[] arr = new String[numRows];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = "";
    }
    if (numRows == 1) {
      return s;
    }
    for (int i = 0; i < n; i++) {

      arr[row] += s.charAt(i);

      if (row == numRows - 1) {
        down = true;
      } else if (row == 0) {
        down = false;
      }
      if (!down) {
        row++;
      } else {
        row--;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      result += arr[i];
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(convert("PAYPALISHIRING", 3));
  }
}
