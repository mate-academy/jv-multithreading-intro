package core.basesyntax.thread;

import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable {
    private static final long DAEMON_DELAY_MS = 500;

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("--- MyRunnable: Starting daemon operation on thread " + threadName + " ---");
        while (true) {
            System.out.println("I am the daemon thread!");

            try {
                TimeUnit.MILLISECONDS.sleep(DAEMON_DELAY_MS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("--- MyRunnable: Interrupted on thread " + threadName + " ---");
                return;
            }
        }
    }
}
