package core.basesyntax.thread;

import static java.lang.Thread.currentThread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(currentThread().getName());
        while (true) {
            System.out.println("I am the daemon thread!");
        }
    }
}
