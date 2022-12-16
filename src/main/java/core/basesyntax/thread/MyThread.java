package core.basesyntax.thread;

import java.util.Random;

public class MyThread extends Thread {
    @Override
    public void run() {
        int random = new Random().nextInt(20);
        for (int i = 0; i < random; i++) {
            System.out.println("Counting numbers: " + i);
        }
    }
}
