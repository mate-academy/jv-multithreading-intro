package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread t1 = new MyThread();
        Thread t2 = new Thread(myRunnable);

        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
