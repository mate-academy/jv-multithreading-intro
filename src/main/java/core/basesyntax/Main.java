package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread customThread = new MyThread();
        MyRunnable customRunnable = new MyRunnable();
        Thread daemonThread = new Thread(customRunnable);
        daemonThread.setDaemon(true);
        customThread.start();
        daemonThread.start();
    }
}
