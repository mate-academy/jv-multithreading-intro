package core.basesyntax.thread;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.printf("%s is running: I am the daemon thread!%n",
                    Thread.currentThread().getName());
        }
    }
}
