package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread userThread = new Thread(new MyRunnable());
        userThread.start();

        Thread daemonThread = new MyThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
