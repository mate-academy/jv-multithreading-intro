package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new MyThread();
        MyRunnable daemonThread = new MyRunnable();
        Thread t2 = new Thread(daemonThread);
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
