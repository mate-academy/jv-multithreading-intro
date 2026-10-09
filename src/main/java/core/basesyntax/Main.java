package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();

        MyRunnable runnable = new MyRunnable();
        Thread daemonThread = new Thread(runnable);
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
