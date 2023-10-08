package core.basesyntax.thread;

public class MyThread extends Thread {
    private static final int MAX_COUNT = 20;
    private int number;

    @Override
    public void run() {
        while (number < MAX_COUNT) {
            ++number;
            System.out.println(number);
        }
    }
}
