package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread newThread = new MyThread();
        newThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread newThread2 = new Thread(myRunnable);
        newThread2.setDaemon(true);
        newThread2.start();
    }
}
