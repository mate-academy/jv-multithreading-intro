package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyRunnable daemonRunnable = new MyRunnable();
        Thread daemonThread = new Thread(daemonRunnable);
        daemonThread.setDaemon(true);

        daemonThread.start();
        myThread.start();
        // write your code here
    }
}
