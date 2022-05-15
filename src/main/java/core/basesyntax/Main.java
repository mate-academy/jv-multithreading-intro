package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread runnableThread = new Thread(runnable);
        runnableThread.start();

        Thread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();
    }
}
