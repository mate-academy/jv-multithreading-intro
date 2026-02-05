package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new MyThread();
        Thread daemonThread = new Thread(new MyRunnable());
        daemonThread.setDaemon(true);
        firstThread.start();
        daemonThread.start();
    }
}
