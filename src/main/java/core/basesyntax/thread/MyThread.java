package core.basesyntax.thread;

import java.util.Random;

public class MyThread extends Thread {
    @Override
    public void run() {
        int randomInt = new Random().nextInt(20);
        System.out.println("Random number is " + randomInt);
    }
}
