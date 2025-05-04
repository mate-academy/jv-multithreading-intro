package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setDaemon(true);

        while (true) {
            System.out.println("I am the daemon thread!");
        }
    }
}
