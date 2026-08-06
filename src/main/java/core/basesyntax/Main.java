package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread daemonThread = new MyThread();
        daemonThread.setDaemon(true);
        daemonThread.start();

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();
    }
}
