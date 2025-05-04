package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread threadThread = new MyThread();
        MyRunnable myRunnableThread = new MyRunnable();
        Thread runnableThread = new Thread(myRunnableThread);
        runnableThread.setDaemon(true);

        threadThread.start();
        runnableThread.start();
    }
}
