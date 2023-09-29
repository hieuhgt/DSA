package Array_and_String.String_Character_char;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _49_Group_Anagrams {
  static boolean areAnagrams(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s1.length(); i++) {
      if (map.containsKey(s1.charAt(i))) {
        map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
      } else {
        map.put(s1.charAt(i), 1);
      }
    }

    for (int i = 0; i < s2.length(); i++) {
      if (map.containsKey(s2.charAt(i))) {
        map.put(s1.charAt(i), map.get(s1.charAt(i)) - 1);
      }
    }
    Set<Character> keys = map.keySet();
    for (Character key : keys) {
      if (map.get(key) != 0) {
        return false;
      }
    }
    return true;
  }

  static List<String> toList(String[] strs) {
    List<String> output = new ArrayList<String>();
    for (String value : strs) {
      output.add(value);
    }
    return output;
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<>();
    if (strs.length == 1) {
      result.add(toList(strs));
    }
    Map<String, List<String>> map = new HashMap<>();

    return result;
  }

  public static void main(String[] args) {
    String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
    System.out.println(groupAnagrams(strs));
  }
}
