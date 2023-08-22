package Array_and_String.String_Character_char.StringBuilder;

public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
  public static boolean arrayStringsAreEqual(String[] arr1, String[] arr2) {
    String r1 = "";
    String r2 = "";

    for (String s : arr1) {
      r1 += s;
    }
    for (String s : arr2) {
      r2 += s;
    }

    return r1.equals(r2);
  }

  // Using StringBuilder
  public static boolean arrayStringsAreEqual2(String[] arr1, String[] arr2) {
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    for (String s : arr1) {
      sb1.append(s);
    }
    for (String s : arr2) {
      sb2.append(s);
    }

    return sb1.toString().equals(sb2.toString());
  }

  public static void main(String[] args) {
    String[] word1 = { "ab", "c" };
    String[] word2 = { "a", "bc" };
    System.out.println(arrayStringsAreEqual(word1, word2));
  }
}
