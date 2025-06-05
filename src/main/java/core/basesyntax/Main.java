package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        MyRunnable threadDaemonRunnable = new MyRunnable();
        MyThread countTo20 = new MyThread();

        Thread threadDaemon = new Thread(threadDaemonRunnable);
        threadDaemon.setDaemon(true);

        countTo20.start();
        threadDaemon.start();

    }
}
