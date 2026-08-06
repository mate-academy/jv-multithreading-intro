package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
    }
}
