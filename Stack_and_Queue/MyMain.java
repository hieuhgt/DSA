package Stack_and_Queue;

public class MyMain {
  public static void main(String[] args) {
    // MyArrayStack myArrayStack = new MyArrayStack(3);
    // myArrayStack.push(1);
    // myArrayStack.push(2);
    // myArrayStack.push(3);
    // myArrayStack.show();
    // MyArrayQueue myArrayQueue = new MyArrayQueue(3);
    // myArrayQueue.push(1);
    // myArrayQueue.push(2);
    // myArrayQueue.push(3);
    // myArrayQueue.show();
    // myArrayQueue.pop();
    // myArrayQueue.show();

    // MyLinkedListStack myLinkedListStack = new MyLinkedListStack();

    // myLinkedListStack.push(1);
    // myLinkedListStack.push(2);
    // myLinkedListStack.push(3);
    // myLinkedListStack.push(4);
    // myLinkedListStack.show();
    // myLinkedListStack.pop();
    // myLinkedListStack.show();

    MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
    myLinkedListQueue.push(1);
    myLinkedListQueue.push(2);
    myLinkedListQueue.push(3);
    myLinkedListQueue.push(4);
    myLinkedListQueue.show();
    myLinkedListQueue.pop();
    myLinkedListQueue.show();
  }
}
