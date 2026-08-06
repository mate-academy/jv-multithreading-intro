package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread runnableThread = new Thread(myRunnable);

        Thread daemonThread = new MyThread();
        daemonThread.setDaemon(true);

        runnableThread.start();
        daemonThread.start();
    }
}
