package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread runnable = new Thread(myRunnable);
        runnable.setDaemon(true);
        runnable.start();

        Thread myThread = new MyThread();
        myThread.start();
    }
}
