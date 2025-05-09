package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);
        t1.start();

        Thread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
    }
}
