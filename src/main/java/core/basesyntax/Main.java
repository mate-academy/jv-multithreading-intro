package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    private static final MyThread myThread = new MyThread();
    private static final MyRunnable myRunnable = new MyRunnable();

    public static void main(String[] args) {
        // write your code here
        Thread daemonThread = new Thread(myRunnable);
        daemonThread.setDaemon(true);
        myThread.start();
        daemonThread.start();
    }
}
