package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable thread = new MyRunnable();
        Thread runnableThread = new Thread(thread);
        Thread demonThread = new MyThread();
        demonThread.setDaemon(true);
        runnableThread.start();
        demonThread.start();
    }
}
