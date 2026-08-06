package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static final boolean isRunning = true;

    @Override
    public void run() {
        while (isRunning) {
            System.out.println("I am the daemon thread!");
        }
    }
}
