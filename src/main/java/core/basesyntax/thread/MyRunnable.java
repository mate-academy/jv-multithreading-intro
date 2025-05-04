package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    private int number = 0;

    @Override
    public void run() {
        while (number <= 20) {
            System.out.println(number);
            number++;
        }
    }
}
