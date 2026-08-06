package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    // write your code here
    @Override
    public void run() {
        System.out.println("I am the daemon thread!");
    }
}
