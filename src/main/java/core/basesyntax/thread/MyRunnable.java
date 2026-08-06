package core.basesyntax.thread;

import java.util.Random;

public class MyRunnable implements Runnable {
    private static ThreadLocal<Integer> numberValue = new ThreadLocal<>();

    @Override
    public void run() {
        numberValue.set(new Random().nextInt(20));
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()
                            + " value = " + numberValue.get());
        }
        numberValue.remove();
    }
}
