package Stack_and_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
  private Queue<Integer> myQueue = new LinkedList<>();

  public int ping(int t) {
    myQueue.add(t);
    System.out.println(myQueue.peek());
    while (myQueue.peek() < t - 3000) {
      myQueue.remove();
    }
    return myQueue.size();
  }
}

/**
 * Main
 */
class TestMain {
  public static void main(String[] args) {
    RecentCounter recentCounter = new RecentCounter();
    recentCounter.ping(1);
    recentCounter.ping(100);
  }
}
