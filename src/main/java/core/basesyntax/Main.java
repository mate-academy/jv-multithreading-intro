package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread thread = new MyThread();
        thread.start();
        MyRunnable myRunnable = new MyRunnable();
        Thread daemonThread = new Thread(myRunnable);
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
