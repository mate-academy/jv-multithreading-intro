package core.basesyntax.thread;

import java.util.Random;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        while (true)
        System.out.println(new Random().nextInt(20));
    }
}
