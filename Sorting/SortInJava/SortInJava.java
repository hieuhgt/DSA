package Sorting.SortInJava;

import java.util.Arrays;
import java.util.Comparator;

public class SortInJava {
  static class Student implements Comparable {
    int age;
    String name;

    public Student(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return "Student{" + " age = " + age + ", name = " + name + " }";
    }

    @Override
    public int compareTo(Object other) {
      // so sanh this and other
      Student otherStudent = (Student) other;
      if (this.age == otherStudent.age) {
        return 0;
      } else if (this.age > otherStudent.age) {
        return 1;
      } else {
        return -1;
      }
      // 0 neu this = other
      // 1 neu this > other
      // - 1 neu this < other
    }
  }

  public static void moveZeros(int[] a) {
    int n = a.length;
    int curIndex = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] != 0) {
        a[curIndex++] = a[i];
      }
    }
  }

  public static void main(String[] args) {
    // ======================= A. Using Arrays.sort =======================
    // #1. Sort an integer array
    int[] intArray = { 3, 2, 1, 0 };
    Arrays.sort(intArray);
    System.out.println(Arrays.toString(intArray));

    // #2. Sort an String array
    String[] stringArray = { "1", "0000", "2" };
    System.out.println(Arrays.toString(stringArray));

    // #3. Sort a Student array with interface Comparable
    Student[] students = { new Student("Anh", 20), new Student("Huy", 14) };
    Arrays.sort(students);
    System.out.println(Arrays.toString(students));

    // #4. Sort a Student array with Comparator
    Arrays.sort(students, new Comparator<Student>() {

      @Override
      public int compare(Student before, Student after) {
        if (before.name.length() == after.name.length()) {
          return 0;
        } else if (before.name.length() > after.name.length()) {
          return 1;
        } else {
          return -1;
        }
        // return before.name.compareTo(after.name);
      }
    });
    System.out.println(Arrays.toString(students));
    int[] arr = { 1, 0, 2, 3, 0, 5 };
    moveZeros(arr);
    System.out.println("DONE");
  }
}
