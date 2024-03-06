package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread daemonThread = new MyThread();
        daemonThread.setDaemon(true);

        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        daemonThread.start();
        thread.start();

    }
}
