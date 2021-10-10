package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myDaemonThread = new MyThread();
        myDaemonThread.setDaemon(true);
        Runnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        myDaemonThread.start();
        myRunnableThread.start();
    }
}
