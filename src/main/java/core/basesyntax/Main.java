package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread daemon = new MyThread();
        daemon.setDaemon(true);

        MyRunnable runnable = new MyRunnable();
        Thread runnableThread = new Thread(runnable);

        daemon.start();
        runnableThread.start();
    }
}
