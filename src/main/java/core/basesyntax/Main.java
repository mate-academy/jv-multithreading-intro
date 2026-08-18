package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread simpleThread = new MyThread();

        Runnable myRunnable = new MyRunnable();

        Thread daemonThread = new Thread(myRunnable);
        daemonThread.setDaemon(true);

        simpleThread.start();
        daemonThread.start();

    }
}
