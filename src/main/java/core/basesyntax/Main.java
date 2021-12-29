package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        Runnable daemonRunnable = new MyRunnable();
        Thread daemonThread = new Thread(daemonRunnable);
        daemonThread.setDaemon(true);
        daemonThread.start();
        thread.start();
    }
}
