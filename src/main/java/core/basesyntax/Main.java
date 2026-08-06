package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        MyThread thread = new MyThread();
        Thread runnableThread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        runnableThread.start();
    }
}
