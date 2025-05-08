package core.basesyntax.deadlock;

public class DeadlockDemo {
  // Two resource objects
  private static final Object resource1 = new Object();
  private static final Object resource2 = new Object();

  public static void main(String[] args) throws InterruptedException {

    Thread t1 = new Thread(() -> {
      synchronized (resource1) {
        System.out.println("Thread 1: Locked Resource 1");
        try {
          Thread.sleep(100); // simulate work
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
          throw new RuntimeException(e);
        }
        synchronized (resource2) {
          System.out.println("Thread 1: Locked Resource 2");
        }
      }
    });
    Thread t2 = new Thread(() -> {
      synchronized (resource2) {
        System.out.println("Thread 2: Locked Resource 2");
        try {
          Thread.sleep(100); // simulate work
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
          throw new RuntimeException(e);
        }
        synchronized (resource1) {
          System.out.println("Thread 2: Locked Resource 1");
        }
      }
    });

    // Start both threads
    t1.start();
    t2.start();
    Thread.sleep(100);
    Thread deadlockChecker = new Thread(new DeadlockChecker());
    deadlockChecker.setDaemon(true);
    deadlockChecker.start();
    System.out.println(Detector.detectDeadLocks());
  }
}
