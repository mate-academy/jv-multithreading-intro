package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Runnable myRunnable = new MyRunnable();
        Thread DaemonThread = new Thread(myRunnable);

        DaemonThread.setDaemon(true);
        DaemonThread.start();
        myThread.start();
    }
}
