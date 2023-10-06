package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnableThread = new MyRunnable();
        Thread userThread = new Thread(runnableThread);
        Thread daemonThread = new MyThread();
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
    }
}
