package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static final int LOOP_START = 0;
    private static final int LOOP_END = 20;

    @Override
    public void run() {
        for (int loopCounter = LOOP_START; loopCounter <= LOOP_END; loopCounter++) {
            System.out.println(loopCounter);
        }
    }
}
