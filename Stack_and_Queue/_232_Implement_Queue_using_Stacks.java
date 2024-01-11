package Stack_and_Queue;

import java.util.Stack;

public class _232_Implement_Queue_using_Stacks {
  class MyQueue {
    Stack<Integer> mainStack = new Stack<>(); // s1
    Stack<Integer> reverseStack = new Stack<>(); // s2

    public MyQueue() {

    }

    public void push(int x) {
      mainStack.push(x);
    }

    public int pop() {
      if (reverseStack.isEmpty()) {
        while (!mainStack.empty()) {
          reverseStack.push(mainStack.pop());
        }
      }
      return reverseStack.pop();
    }

    public int peek() {
      if (reverseStack.isEmpty()) {
        while (!mainStack.isEmpty()) {
          reverseStack.push(mainStack.pop());
        }
      }
      return reverseStack.peek();
    }

    public boolean empty() {
      return mainStack.isEmpty() && reverseStack.isEmpty();
    }
  }

  public static void main(String[] args) {

  }
}

// Queue [1,2,3,4,5]
// Stack s1: .push() => push to s1 => .pop when s2 empty => s1 fill to s2
// Stack s2