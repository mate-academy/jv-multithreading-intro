package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread firstDaemonThread = new MyThread();
        firstDaemonThread.setDaemon(true);
        firstDaemonThread.start();

        Thread secondDaemonThread = new Thread(new MyRunnable());
        secondDaemonThread.setDaemon(true);
        secondDaemonThread.start();
    }
}
