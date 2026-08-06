package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread threadFromRunnable = new Thread(new MyRunnable());
        MyThread daemonFromThread = new MyThread();
        daemonFromThread.setDaemon(true);
        threadFromRunnable.start();
        daemonFromThread.start();
    }
}
