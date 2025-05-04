package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myDaemonThread = new MyThread();
        Thread numberThread = new Thread(new MyRunnable());

        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        numberThread.start();
    }
}
