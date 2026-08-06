package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
            try {
                Thread.sleep(500L); // Sleep to make the output more readable
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
