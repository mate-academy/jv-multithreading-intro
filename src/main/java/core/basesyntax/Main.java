package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        MyThread myThread = new MyThread();
        myThread.run();
        MyRunnable daemonThread = new MyRunnable();
        daemonThread.setDaemon(true);
        daemonThread.run();
    }
}

