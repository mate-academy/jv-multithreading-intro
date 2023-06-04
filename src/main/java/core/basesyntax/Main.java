package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread threadMyRunnable = new Thread(myRunnable);
        threadMyRunnable.setDaemon(true);
        myThread.start();
        threadMyRunnable.start();
    }
}
