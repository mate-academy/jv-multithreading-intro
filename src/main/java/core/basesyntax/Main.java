package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread myRunnable = new Thread(runnable);
        Thread myThread = new MyThread();
        myThread.setDaemon(true);

        myRunnable.start();
        myThread.start();
    }
}
