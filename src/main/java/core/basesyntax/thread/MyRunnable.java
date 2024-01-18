package core.basesyntax.thread;

import java.util.Random;

public class MyRunnable implements Runnable {
    private static ThreadLocal<Integer> number = new ThreadLocal<>();
    @Override
    public void run() {
        number.set(new Random().nextInt(20));
        System.out.printf(
                "Thread: %s. Number value is %s%n",
                Thread.currentThread().getName(),
                number.get()
        );
    }
}
