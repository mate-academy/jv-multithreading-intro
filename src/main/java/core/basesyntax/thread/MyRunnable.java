package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
        }
    }
}
