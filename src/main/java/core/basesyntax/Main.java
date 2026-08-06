package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Runnable myRunnable = new MyRunnable();
        Thread myDaemonThread = new Thread(myRunnable);
        myDaemonThread.setDaemon(true);

        myDaemonThread.start();
        myThread.start();
    }
}
