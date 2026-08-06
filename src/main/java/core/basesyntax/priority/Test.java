package core.basesyntax.priority;

import static java.lang.Thread.MAX_PRIORITY;

public class Test {
  public static void main(String[] args) {
    // getting reference to Main thread
    Thread currentThread = Thread.currentThread();

    // getting name of Main thread
    System.out.println("Current thread: " + currentThread.getName());
    // changing name of Main thread
    currentThread.setName("CurrentThread");
    System.out.println("After name change: " + currentThread.getName());

    // getting priority of Main thread
    System.out.println("Main thread priority: "+ currentThread.getPriority());
    // setting priority of Main thread to MAX(10)
    currentThread.setPriority(MAX_PRIORITY);
    System.out.println("Main thread new priority: "+ currentThread.getPriority());
  }
}
