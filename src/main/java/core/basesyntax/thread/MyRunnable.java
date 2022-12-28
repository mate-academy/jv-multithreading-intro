package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private final int numberLimit;

    public MyRunnable(int numberLimit) {
        this.numberLimit = numberLimit;
    }

    @Override
    public void run() {
        for (int i = 0; i <= numberLimit; i++) {
            System.out.println(i);
        }
    }
}
