package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread runnableThread = new Thread(runnable);
        Thread deamonThread = new MyThread();
        deamonThread.setDaemon(true);
        deamonThread.start();
        runnableThread.start();
    }
}
