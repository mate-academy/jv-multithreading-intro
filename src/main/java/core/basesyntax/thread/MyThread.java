package core.basesyntax.thread;

import java.util.Random;

public class MyThread extends Thread {
    private int number;

    @Override
    public void run() {
        number = new Random().nextInt(20);
        System.out.println(number);
    }
}
