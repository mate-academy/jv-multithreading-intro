package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
            try {
                Thread.sleep(500); // Adding a small delay to slow down the message printing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    // write your code here
}
