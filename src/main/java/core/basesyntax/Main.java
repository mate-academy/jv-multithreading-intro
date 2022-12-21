package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Runnable myRunnable = new MyRunnable();
        Thread runThread = new Thread(myRunnable);
        myThread.setDaemon(true);
        myThread.start();
        runThread.start();
    }
}
