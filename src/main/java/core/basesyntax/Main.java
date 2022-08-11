package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("thread-consumer");
        MyRunnable myRunnable = new MyRunnable("thread-daemon");
        Thread runnableDaemon = new Thread(myRunnable);
        runnableDaemon.setDaemon(true);
        myThread.start();
        runnableDaemon.start();
    }
}
