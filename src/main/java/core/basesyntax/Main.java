package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);
        t1.start();


        MyThread t2 = new MyThread(() -> {
            for (int i = 0; i <= 20; i++) {
                System.out.println(i);
            }
        });
        t2.start();
    }
}
