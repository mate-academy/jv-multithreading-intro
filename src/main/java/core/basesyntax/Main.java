package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread numberThread = new Thread(new MyRunnable());
        Thread daemonThread = new MyThread();
        daemonThread.setDaemon(true);
        numberThread.start();
        daemonThread.start();
    }
}
