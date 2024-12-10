package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Daemon thread interrupted during sleep: " + e.getMessage());
            }
        }
    }
}
