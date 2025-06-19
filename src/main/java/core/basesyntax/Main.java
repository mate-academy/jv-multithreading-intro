package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread numberThread = new MyThread();

        Thread daemonRunnable = new Thread(new MyRunnable());
        daemonRunnable.setDaemon(true);

        numberThread.start();
        daemonRunnable.start();
    }
}

