package core.basesyntax.deadlock;

public class DeadlockWithLockOrdering {
  // Two resource objects
  private static final String resource1 = "abc";
  private static final String resource2 = "bcd";

  public static void main(String[] args) {
    // Thread 1
    Thread t1 = new Thread(() -> {
      String firstLock = (resource1.compareTo(resource2) >= 0) ? resource1 : resource2;
      String secondLock = (resource1.compareTo(resource2) >= 0) ? resource2 : resource1;
      synchronized (firstLock) {
        System.out.println("Thread 1: Locked Resource 1");

        try {
          Thread.sleep(100); // Simulate work
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
          throw new RuntimeException(e);
        }

        synchronized (secondLock) {
          System.out.println("Thread 1: Locked Resource 2");
        }
      }
    });

    // Thread 2
    Thread t2 = new Thread(() -> {
      String firstLock = (resource1.compareTo(resource2) >= 0) ? resource1 : resource2;
      String secondLock = (resource1.compareTo(resource2) >= 0) ? resource2 : resource1;
      synchronized (firstLock) {
        System.out.println("Thread 2: Locked Resource 2");

        try {
          Thread.sleep(100); // Simulate work
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
          throw new RuntimeException(e);
        }

        synchronized (secondLock) {
          System.out.println("Thread 2: Locked Resource 1");
        }
      }
    });

    // Start both threads
    t1.start();
    t2.start();
  }
}
