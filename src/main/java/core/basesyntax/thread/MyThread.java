package core.basesyntax.thread;

public class MyThread extends Thread {
    private static final int BOUND = 20;

    @Override
    public void run() {
        for (int i = 0; i <= BOUND; i++) {
            System.out.println(i);
        }
    }
}
