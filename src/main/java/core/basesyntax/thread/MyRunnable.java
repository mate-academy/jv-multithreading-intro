package core.basesyntax.thread;

import java.util.Random;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(new Random().nextInt(20));
    }
    // write your code here
}
