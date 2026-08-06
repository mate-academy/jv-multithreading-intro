package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Runnable runnable = new MyRunnable();
        Thread t2 = new Thread(runnable);
        t2.setDaemon(true);
        t2.start();
        t1.start();
    }
}
