package core.basesyntax.thread;

public class MyRunnable implements Runnable {

    private static final int END_OF_RANGE = 20;

    @Override
    public void run() {
        for (int i = 0; i < END_OF_RANGE; i++) {
            System.out.println(i);
        }
    }
}
