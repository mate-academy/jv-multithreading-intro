package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static final int TO = 20;

    @Override
    public void run() {
        for (int i = 0; i <= TO; i++) {
            System.out.println(i);
        }
    }
}
