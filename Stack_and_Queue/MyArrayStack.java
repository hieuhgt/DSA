package Stack_and_Queue;

public class MyArrayStack implements IStackQueue<Integer> {

  private int[] array;
  private int SIZE;
  private int topIndex;

  MyArrayStack(int size) {
    array = new int[size];
    SIZE = size;
    topIndex = -1;
  }

  @Override
  public boolean push(Integer value) {
    if (!isFull()) {
      topIndex++;
      array[topIndex] = value;
      return true;
    }
    return false;
  }

  @Override
  public Integer pop() {
    if (!isEmpty()) {
      int value = array[topIndex];
      topIndex--;
      return value;
    }
    return -1;
  }

  @Override
  public boolean isFull() {
    return topIndex == SIZE - 1;
  }

  @Override
  public boolean isEmpty() {
    return topIndex < 0;
  }

  @Override
  public void show() {
    if (isEmpty()) {
      System.out.println("Stack is empty!");
    } else {
      for (int i = 0; i <= topIndex; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
  }

}
