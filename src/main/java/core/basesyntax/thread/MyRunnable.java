package core.basesyntax.thread;

public class MyRunnable implements Runnable {

    public static final int TIMES_TO_PRINT = 20;

    @Override
    public void run() {
        for (int i = 0; i <= TIMES_TO_PRINT; i++) {
            System.out.println(i);
        }
    }
}
