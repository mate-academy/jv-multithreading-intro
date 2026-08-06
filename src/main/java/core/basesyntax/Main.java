package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread myRunnableDaemonThread = new Thread(new MyRunnable());
        myRunnableDaemonThread.setDaemon(true);
        myRunnableDaemonThread.start();
        myThread.start();
    }
}
