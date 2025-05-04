package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am the daemon thread!");
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException("Daemon vanquished" + e);
            }
        }
    }
}
