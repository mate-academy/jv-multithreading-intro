package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread userThread = new MyThread();
        MyRunnable daemonThread = new MyRunnable();
        Thread myDaemonThread = new Thread(daemonThread);
        myDaemonThread.setDaemon(true);
        userThread.start();
        myDaemonThread.start();
    }
}
