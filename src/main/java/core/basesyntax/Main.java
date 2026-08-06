package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Runnable runnable = new MyRunnable();
        Thread myRunnable = new Thread(runnable);
        myThread.setDaemon(true);
        myThread.start();
        myRunnable.start();
    }
}
