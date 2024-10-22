package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static final int NUMBER_LIMIT = 20;

    @Override
    public void run() {
        for (int i = 0; i <= NUMBER_LIMIT; i++) {
            System.out.println(i);
        }
    }
}
