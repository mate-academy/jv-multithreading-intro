package core.basesyntax.thread;

import java.util.concurrent.TimeUnit;

public class DaemonThreadExample implements Runnable {
  public void run() {
    while (true) {
      try {
        TimeUnit.MICROSECONDS.sleep(40);
        System.out.println("Daemon thread is running...");
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

  public static void main(String[] args) {
    Thread daemonThread = new Thread(new DaemonThreadExample());
    daemonThread.setDaemon(true);
    daemonThread.start();
    System.out.println("Main thread is ending.");
  }
}
