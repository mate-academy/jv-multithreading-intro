package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        Runnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        myThread.start();
        myRunnableThread.start();
    }
}
