package core.basesyntax.thread;

import java.security.SecureRandom;
import java.util.Random;

public class MyRunnable implements Runnable {
    private final Random random = new SecureRandom();

    @Override
    public void run() {
        System.out.println("random number: " + random.nextInt(20));
    }
}
