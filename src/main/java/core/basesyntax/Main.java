package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread runnableThread = new Thread(runnable);
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        runnableThread.start();
        myThread.start();
    }
}
