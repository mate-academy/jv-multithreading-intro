package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        Thread myRunnableThread = new Thread(myRunnable);

        myThread.start();
        myRunnableThread.start();
    }
}
