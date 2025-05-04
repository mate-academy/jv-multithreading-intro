package core.basesyntax.thread;

import java.util.Random;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        int number = random.nextInt(20);
        System.out.println(number);
    }
}
