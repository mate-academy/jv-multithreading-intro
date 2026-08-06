package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // Thread extending Thread
        Thread numberThread = new MyThread();
        numberThread.start();

        // Thread implementing Runnable (daemon)
        Thread daemonThread = new Thread(new MyRunnable());
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
