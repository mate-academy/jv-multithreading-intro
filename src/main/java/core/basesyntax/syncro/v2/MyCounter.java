package core.basesyntax.syncro.v2;

public class MyCounter {
  private int count = 0;

  public void add(int value) {
    System.out.println("This line is not synchronized, multiple threads can access it at the same time");
    synchronized (this) {
      count += value;
    }
  }

  public void subtract(int value) {
    System.out.println("This line is not synchronized, multiple threads can access it at the same time");
    synchronized (MyCounter.class) {
      count -= value;
    }
  }
}
