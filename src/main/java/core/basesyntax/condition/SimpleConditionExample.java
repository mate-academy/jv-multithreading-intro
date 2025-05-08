package core.basesyntax.condition;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SimpleConditionExample {
  private static final Lock lock = new ReentrantLock();
  private static final Condition condition = lock.newCondition();
  private static int sharedData = 0;

  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(() -> {
      lock.lock();
      try {
        while (sharedData == 0) {
          condition.await();
        }
        System.out.println("Thread 1: Shared Data = " + sharedData);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      } finally {
        lock.unlock();
      }
    });

    Thread t2 = new Thread(() -> {
      lock.lock();
      try {
        sharedData = 1;
        condition.signal();
      } finally {
        lock.unlock();
      }
    });

    t1.start();
    TimeUnit.MILLISECONDS.sleep(100); // Simulate some processing
    t2.start();

    t1.join();
    t2.join();
  }
}
