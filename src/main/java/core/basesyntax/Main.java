package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread myDaemon = new Thread(myRunnable);
        myDaemon.setDaemon(true);
        myThread.start();
        myDaemon.start();
    }
}
