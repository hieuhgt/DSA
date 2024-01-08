package HashTable;

import java.util.HashMap;
import java.util.Map;

public class _387_First_Unique_Character_in_String {
  public static int firstUniqChar(String s) {
    char[] chars = s.toCharArray();
    Map<Character, Integer> myMap = new HashMap<>();
    for (char c : chars) {
      if (!myMap.containsKey(c)) {
        myMap.put(c, 1);
      } else {
        myMap.put(c, myMap.get(c) + 1);
      }
    }
    for (int i = 0; i < chars.length; i++) {
      if (myMap.get(chars[i]) == 1) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(firstUniqChar("loveleetcode"));
    System.out.println(firstUniqChar("leetcode"));
    System.out.println(firstUniqChar("aabb"));
  }
}
