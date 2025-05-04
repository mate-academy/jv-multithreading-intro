package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread numberThread = new MyThread();
        numberThread.start();

        MyRunnable daemonRunnable = new MyRunnable();
        Thread daemonThread = new Thread(daemonRunnable);
        daemonThread.setDaemon(true); // Set this thread as a daemon thread
        daemonThread.start();
    }
}
