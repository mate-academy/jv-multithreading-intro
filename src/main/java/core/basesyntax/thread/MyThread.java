package core.basesyntax.thread;

import java.util.Random;

public class MyThread extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        System.out.println(random.nextInt(20));
    }
}
