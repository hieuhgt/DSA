package Array_and_String.String_Character_char;

public class _387_First_Unique_Character_in_a_String {
  public static int firstUniqChar(String s) {
    char[] arr = s.toCharArray();
    // normal character in ascii by decimal from 97 -> 122
    int[] count = new int[123];
    for (int i = 0; i < arr.length; i++) {
      char c = arr[i];
      int index = (int) c;
      count[index]++;
    }

    for (int i = 0; i < arr.length; i++) {
      char c = arr[i];
      int index = (int) c;
      if (count[index] == 1) {
        return i;
      }
    }
    return -1;
  }

  public static void uniqueCharacters(String test) {
    String temp = "";
    for (int i = 0; i < test.length(); i++) {
      char current = test.charAt(i);
      System.out.println(temp.indexOf(current));
      if (temp.indexOf(current) < 0) {
        temp = temp + current;
      } else {
        temp = temp.replace(String.valueOf(current), "");
      }
    }

    System.out.println(temp + " ");

  }

  public static void main(String[] args) {
    uniqueCharacters("loveleetcode");
    System.out.println(firstUniqChar("loveleetcode"));
  }
}
