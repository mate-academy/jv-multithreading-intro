package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread t2 = new MyThread();
        t2.start();
        Thread t1 = new Thread(myRunnable);
        t1.setDaemon(true);
        t1.start();
    }
}
