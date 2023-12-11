package Stack_and_Queue;

public class MyArrayQueue implements IStackQueue<Integer> {
  private int[] array;
  private int SIZE;
  private int headIndex;
  private int tailIndex;

  MyArrayQueue(int size) {
    array = new int[size];
    SIZE = size;
    headIndex = tailIndex = -1;
  }

  @Override
  public boolean push(Integer value) {
    if (!isFull()) {
      if (isEmpty()) {
        headIndex++;
      }
      tailIndex++;
      array[tailIndex] = value;

      return true;
    }
    return false;
  }

  @Override
  public Integer pop() {
    int value = -1;
    if (!isEmpty()) {
      value = array[headIndex];
      headIndex++;
      if (headIndex > tailIndex) {
        headIndex = tailIndex = -1;
      }
    }
    return value;
  }

  @Override
  public boolean isFull() {
    return tailIndex == SIZE - 1;
  }

  @Override
  public boolean isEmpty() {
    return (headIndex == -1) && (tailIndex == -1);
  }

  @Override
  public void show() {
    if (isEmpty()) {
      System.out.println("Queue is empty!");
    } else {
      for (int i = headIndex; i <= tailIndex; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
  }

  public int count() {
    if (isEmpty()) {
      return 0;
    }
    return tailIndex - headIndex + 1;
  }
}
