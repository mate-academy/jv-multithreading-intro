package core.basesyntax;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
  private static final Semaphore semaphore = new Semaphore(2);

  public static void main(String[] args) throws InterruptedException {
    Thread thread1 = new Thread(SemaphoreExample::accessResource, "Thread-1");
    Thread thread2 = new Thread(SemaphoreExample::accessResource, "Thread-2");
    Thread thread3 = new Thread(SemaphoreExample::accessResource, "Thread-3");

    thread1.start();
    thread2.start();
    thread3.start();

    thread1.join();
    thread2.join();
    thread3.join();
  }

  private static void accessResource() {
    try {
      semaphore.acquire();
      System.out.println(Thread.currentThread().getName() + " acquired the semaphore.");
      Thread.sleep(1000); // Simulating a resource-intensive operation
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    } finally {
      System.out.println(Thread.currentThread().getName() + " released the semaphore.");
      semaphore.release();
    }
  }
}
