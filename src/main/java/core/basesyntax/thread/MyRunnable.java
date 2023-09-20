package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("I am the daemon thread! " + Thread.currentThread().getName());
    }
    // write your code here
}
