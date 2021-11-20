package core.basesyntax.thread;

import java.util.Random;

public class MyRunnable implements Runnable {
    private static int numberValue = 0;

    @Override
    public void run() {
        numberValue = new Random().nextInt(20);
        System.out.println("The MyRunnable thread is running "
                + Thread.currentThread().getName()
                + " the number is: " + numberValue);
    }
}
