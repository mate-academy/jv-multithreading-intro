package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static final int LIMIT = 20;

    @Override
    public void run() {
        for (int i = 0; i <= LIMIT; i++) {
            System.out.println(i);
        }
    }
}
