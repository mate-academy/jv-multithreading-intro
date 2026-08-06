package core.basesyntax.thread;

public class MyThread extends Thread {
    private static final int CYCLES = 20;

    @Override
    public void run() {
        for (int i = 0; i < CYCLES; i++) {
            System.out.println(i);
        }
    }
}
