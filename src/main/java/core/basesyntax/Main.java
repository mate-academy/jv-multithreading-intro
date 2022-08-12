package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread forRunnable = new Thread(myRunnable);
        forRunnable.setDaemon(true);
        MyThread myThread = new MyThread();
        forRunnable.start();
        myThread.start();
    }
}
