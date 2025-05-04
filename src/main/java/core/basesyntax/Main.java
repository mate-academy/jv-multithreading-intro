package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread daemonThread = new Thread(myRunnable);
        daemonThread.setDaemon(true);
        daemonThread.start();

        MyThread threadWithNumbers = new MyThread();
        threadWithNumbers.start();
    }
}
