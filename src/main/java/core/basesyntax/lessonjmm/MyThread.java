package core.basesyntax.lessonjmm;

public class MyThread extends Thread {
  private final String name;

  public MyThread(String name) {
    this.name = name;
  }

  public void run() {
    System.out.println("Thread is started: " + name);
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      throw new RuntimeException("Thread " + name + " was interrupted", e);
    }
    System.out.println("Thread is done: " + name);
  }
}
