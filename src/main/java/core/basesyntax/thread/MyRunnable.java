package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static final int START = 0;
    private static final int FINISH = 20;

    @Override
    public void run() {
        for (int i = START; i <= FINISH; i++) {
            System.out.println(i);
        }
    }
}
