package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable(20);
        Thread runnableThread = new Thread(myRunnable);
        Thread myThread = new MyThread();
        runnableThread.start();
        myThread.setDaemon(true);
        myThread.start();
    }
}
