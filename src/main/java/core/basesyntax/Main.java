package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread runnableThread = new Thread(new MyRunnable());
        Thread threadThread = new MyThread();
        threadThread.setDaemon(true);
        runnableThread.start();
        threadThread.start();
    }
}
