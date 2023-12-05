package core.basesyntax.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        String message = "I am the daemon thread!";
        while (true) {
            System.out.printf("%s: %s\n", Thread.currentThread().getName(), message);
        }
    }
}
