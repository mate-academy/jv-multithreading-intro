package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new  MyRunnable();
        Thread userThread = new Thread(runnable);
        userThread.start();
        Thread daemonThread = new MyThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
