package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread threadOne = new Thread(r);
        MyThread daemonThread = new MyThread();
        daemonThread.setDaemon(true);
        threadOne.start();
        daemonThread.start();

    }
}
