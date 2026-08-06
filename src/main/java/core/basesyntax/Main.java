package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myDaemonThread = new Thread(myRunnable);
        myDaemonThread.setDaemon(true);
        MyThread myThread = new MyThread();
        myDaemonThread.start();;
        myThread.start();
    }
}
