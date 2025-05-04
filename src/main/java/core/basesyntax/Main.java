package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Runnable runnable = new MyRunnable();
        Thread runnableThread = new Thread(runnable);

        myThread.start();
        runnableThread.setDaemon(true);
        runnableThread.start();
    }
}
