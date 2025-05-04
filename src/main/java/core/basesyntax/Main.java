package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread daemonThread = new Thread(runnable);
        daemonThread.setDaemon(true);

        Thread thread = new MyThread();

        daemonThread.start();
        thread.start();
    }
}
