package Stack_and_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _225_Implement_Stack_using_Queues {
  static class MyStack {
    Queue<Integer> mainQueue = new LinkedList<>();
    Queue<Integer> subQueue = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
      mainQueue.add(x);
    }

    public int pop() {
      int value = -1;
      while (!mainQueue.isEmpty()) {
        if (mainQueue.size() == 1) {
          value = mainQueue.remove();
        } else {
          subQueue.add(mainQueue.remove());
        }
      }
      Queue<Integer> temp = mainQueue;
      mainQueue = subQueue;
      subQueue = temp;

      return value;
    }

    public int top() {
      int value = -1;
      while (mainQueue.size() > 1) {
        subQueue.add(mainQueue.remove());
      }
      value = mainQueue.peek();

      return value;
    }

    public boolean empty() {
      return mainQueue.isEmpty() && subQueue.isEmpty();
    }

  }

  public static void main(String[] args) {
    MyStack myStack = new MyStack();
    myStack.push(1);
    myStack.push(2);
    System.out.println(myStack.top());
    System.out.println(myStack.pop()); // return 2
    System.out.println(myStack.top());
    System.out.println(myStack.top());
    // System.out.println(myStack.pop()); // return 2
    // System.out.println(myStack.top());
    // System.out.println(myStack.empty()); // return False
  }
}
