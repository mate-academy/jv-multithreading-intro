package core.basesyntax.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
            }
        }
    }
}
