package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyRunnable daemonRunnable = new MyRunnable();
        Thread daemonThread = new Thread(daemonRunnable);
        daemonThread.setDaemon(true);
        t1.start();
        daemonThread.start();
    }
}
