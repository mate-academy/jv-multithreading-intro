package core.basesyntax.thread;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("--- MyThread Thread: Starting operation ---");

        for (int i = 0; i <= 20; i++) {
            System.out.printf("%s: Count %d%n", getName(), i);

            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("--- MyThread Thread: Finishing operation ---");
    }
}
