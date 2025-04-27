package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread threadOne = new MyThread();
        Runnable myDaemon = new MyRunnable();
        Thread threadDaemon = new Thread(myDaemon);
        threadOne.start();
        threadDaemon.setDaemon(true);
        threadDaemon.start();
    }
}
