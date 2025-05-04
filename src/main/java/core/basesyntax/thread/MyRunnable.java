package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
            try {
                Thread.sleep(1000); // sleep for a second to prevent flooding the console
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
