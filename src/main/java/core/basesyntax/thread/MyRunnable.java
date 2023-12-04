package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            while (true) {
                System.out.println("I am the daemon thread!");
            }
        }
    }
}
