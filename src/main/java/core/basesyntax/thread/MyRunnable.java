package core.basesyntax.thread;

import static java.lang.Thread.sleep;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int limit = 20;
        for (int i = 0; i <= limit; i++) {
            System.out.println(i);
            try {
                sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
