package core.basesyntax.thread;

public class MyThread extends Thread {
    private static final int MAX_BOUND = 20;
    private int counter;

    @Override
    public void run() {
        while (counter <= MAX_BOUND) {
            System.out.println(counter++);
        }
    }
}
