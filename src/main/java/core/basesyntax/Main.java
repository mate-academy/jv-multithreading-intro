package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread threadRunnable = new Thread(myRunnable);
        threadRunnable.setDaemon(true);
        threadRunnable.start();
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
