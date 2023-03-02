package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread myDaemonThread = new Thread(new MyRunnable());
        myDaemonThread.setDaemon(true);

        myThread.start();
        myDaemonThread.start();
    }
}
