package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable daemonThread = new MyRunnable();
        Thread myDaemonThread = new Thread(daemonThread);
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        MyThread userThread = new MyThread();
        userThread.start();
    }
}
