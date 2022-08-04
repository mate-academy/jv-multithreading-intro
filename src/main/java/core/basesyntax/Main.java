package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        MyThread myThread = new MyThread();
        Thread newThread = new Thread(myRunnable);
        newThread.setDaemon(true);
        newThread.start();
        myThread.start();
    }
}
