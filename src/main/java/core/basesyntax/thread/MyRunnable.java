package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static final int END_NUMBER = 20;

    @Override
    public void run() {
        for (int i = 0; i <= END_NUMBER; i++) {
            System.out.println(i);
        }
    }
}
