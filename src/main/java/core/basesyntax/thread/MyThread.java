package core.basesyntax.thread;

import java.util.Random;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(new Random().nextInt(20));
    }
}
