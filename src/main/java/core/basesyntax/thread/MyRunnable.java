package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static final int COUNTER = 20;

    @Override
    public void run() {
        for (int i = 0; i <= COUNTER; i++) {
            System.out.println(
                    Thread.currentThread().getName() + " : " + i
            );
        }

    }
}
