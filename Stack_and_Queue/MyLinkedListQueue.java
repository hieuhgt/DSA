package Stack_and_Queue;

public class MyLinkedListQueue implements IStackQueue<Integer> {

  private class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

  Node headNode, tailNode;

  MyLinkedListQueue() {
    headNode = tailNode = null;
  }

  @Override
  public boolean push(Integer value) {
    // Add vao cuoi
    if (isFull()) {
      return false;
    }
    Node newNode = new Node(value);
    if (isEmpty()) {
      headNode = tailNode = newNode;
    } else {
      tailNode.next = newNode;
      tailNode = newNode;
    }
    return true;
  }

  @Override
  public Integer pop() {
    // Pop phan dau
    if (isEmpty()) {
      return -1;
    }
    int value = headNode.value;
    if (headNode == tailNode) {
      headNode = tailNode = null;
    } else {
      headNode = headNode.next;
    }
    return value;
  }

  @Override
  public boolean isFull() {
    return false;
  }

  @Override
  public boolean isEmpty() {
    return (headNode == null) && (tailNode == null);
  }

  @Override
  public void show() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return;
    }
    Node curNode = headNode;
    while (curNode != null) {
      System.out.print(curNode.value + " ");
      curNode = curNode.next;
    }
    System.out.println();
  }

}
