package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {

        Thread daemonThread = new MyThread();
        daemonThread.setDaemon(true);
        daemonThread.start();

        Thread userThread = new Thread(new MyRunnable());
        userThread.start();
    }
}
