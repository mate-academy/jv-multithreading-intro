package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private static final int MAX_VALUE = 20;

    @Override
    public void run() {
        int counter = 0;
        while (counter <= MAX_VALUE) {
            System.out.println(counter++);
        }
    }
}
