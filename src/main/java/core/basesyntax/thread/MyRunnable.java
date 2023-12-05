package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.printf("%s: %d\n", Thread.currentThread().getName(),i);
        }
    }
}
