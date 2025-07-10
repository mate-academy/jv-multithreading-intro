package core.basesyntax.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
  private final Lock lock = new ReentrantLock();
  private int count = 0;

  public void increment() {
    lock.lock();
    try {
      count++;
    } finally {
      lock.unlock();
    }
  }

  public int getCount() {
    return count;
  }
}
