package HashTable;

import java.util.HashMap;
import java.util.Map;

public class HashMapJava {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 1, 2 };
    Map<Integer, Integer> myMap = new HashMap<>();
    // Key: gia tri cua phan tu trong mang
    // Value: so lan xuat hien cua phan tu trong mang
    for (int i : arr) {
      if (!myMap.containsKey(i)) {
        // key chua ton tai trong map
        myMap.put(i, 1);
      } else {
        int count = myMap.get(i);
        myMap.put(i, count += 1);
      }
    }

    for (Map.Entry entry : myMap.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
