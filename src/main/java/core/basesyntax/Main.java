package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread daemonThread = new MyThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
        MyRunnable myRunnable = new MyRunnable();
        Thread newThread = new Thread(myRunnable);
        newThread.start();
    }
}

