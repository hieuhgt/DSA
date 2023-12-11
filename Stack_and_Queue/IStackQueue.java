package Stack_and_Queue;

public interface IStackQueue<T> {
  public boolean push(T value);

  public T pop();

  public boolean isFull();

  public boolean isEmpty();

  public void show();
}