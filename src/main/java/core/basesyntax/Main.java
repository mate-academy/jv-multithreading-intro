package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        MyThread myThreadDaemon = new MyThread();
        myThreadDaemon.setDaemon(true);
        myThreadDaemon.start();
        myThread.start();
    }
}
