package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
        }
    }
    // write your code here
}
