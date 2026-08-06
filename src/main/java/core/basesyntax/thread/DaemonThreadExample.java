package core.basesyntax.thread;

import java.util.concurrent.TimeUnit;

public class DaemonThreadExample implements Runnable {
  public void run() {
    while (true) {
      try {
        TimeUnit.MICROSECONDS.sleep(100000);
        System.out.println("Daemon thread is running...");
      } catch (InterruptedException e) {
        System.out.println(11111);
        Thread.currentThread().interrupt();
        System.out.println("Interrupted exception !!!" + Thread.currentThread().isInterrupted());
        return;
      } finally {
        System.out.println("finally");
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Thread daemonThread = new Thread(new DaemonThreadExample());
    daemonThread.setDaemon(true);
    daemonThread.start();
    Thread.sleep(1000);
    daemonThread.interrupt();
    System.out.println("Main thread is ending.");
  }
}
