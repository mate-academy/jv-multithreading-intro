package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread daemonThread = new MyThread();
        Runnable numberThread = new MyRunnable();
        Thread numberThreadRunnable = new Thread(numberThread);
        daemonThread.setDaemon(true);
        numberThreadRunnable.start();
        daemonThread.start();
    }
}
