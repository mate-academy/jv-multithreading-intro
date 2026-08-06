package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Runnable runnableThread = new MyRunnable();
        Thread daemonThread = new Thread(runnableThread);
        daemonThread.setDaemon(true);
        myThread.start();
        daemonThread.start();
    }
}
