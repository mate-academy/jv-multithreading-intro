package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Daemon thread was interrupted: " + e.getMessage());
                break;
            }
        }
    }
}
