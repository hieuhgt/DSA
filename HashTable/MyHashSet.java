package HashTable;

import java.util.ArrayList;

public class MyHashSet {
  private final int SIZE = 1000;
  private ArrayList<Integer> myBuckets[];

  MyHashSet() {
    myBuckets = new ArrayList[SIZE];
    for (int i = 0; i < myBuckets.length; i++) {
      myBuckets[i] = new ArrayList<>();
    }
  }

  // return hash value
  int hashFunction(int key) {
    return key % SIZE;
  }

  void add(int key) {
    int hashValueIndex = hashFunction(key);
    var buckets = myBuckets[hashValueIndex];
    int keyIndex = buckets.indexOf(key);
    if (keyIndex < 0) {
      buckets.add(key);
    }
  }

  void remove(int key) {
    int hashValueIndex = hashFunction(key);
    var buckets = myBuckets[hashValueIndex];
    int keyIndex = buckets.indexOf(key);
    if (keyIndex >= 0) {
      buckets.remove(keyIndex);
    }
  }

  boolean contains(int key) {
    int hashValueIndex = hashFunction(key);
    var buckets = myBuckets[hashValueIndex];
    // return buckets.contains(key);
    return buckets.indexOf(key) >= 0;
  }

  public static void main(String[] args) {
    MyHashSet mySet = new MyHashSet();
    mySet.add(1);
    mySet.add(1);
    mySet.add(2);
    mySet.remove(1);
    System.out.println(mySet.contains(2));
  }
}
