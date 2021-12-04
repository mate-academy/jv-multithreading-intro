package core.basesyntax.thread;

import java.util.Random;

public class MyThread extends Thread {
    private static ThreadLocal<Integer> number = new ThreadLocal<>();

    @Override
    public void run() {
        number.set(new Random().nextInt(10));
        System.out.println(number.get());
    }
}
