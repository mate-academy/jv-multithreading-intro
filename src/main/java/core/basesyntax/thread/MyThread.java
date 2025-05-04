package core.basesyntax.thread;

public class MyThread extends Thread {
    private static final int LIMIT_NUMBER = 20;

    @Override
    public void run() {
        for (int i = 0; i <= LIMIT_NUMBER; i++) {
            System.out.println(i);
        }
    }
}
