package core.basesyntax.thread;

import java.util.Random;

public class MyThread extends Thread {
    @Override
    public void run() {
        int number = new Random().nextInt(20);
        System.out.println(number);
    }
}
