package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnableThread = new MyRunnable();
        Thread thread = new Thread(runnableThread);

        MyThread daemonThread = new MyThread();
        daemonThread.setDaemon(true);

        thread.start();
        daemonThread.start();
    }
}
