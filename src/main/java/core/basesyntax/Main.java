package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread daemonThread = new MyThread();
        daemonThread.setDaemon(true);
        Thread workerThread = new Thread(new MyRunnable());
        daemonThread.start();
        workerThread.start();
    }
}
