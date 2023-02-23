package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        myRunnableThread.setDaemon(true);
        Thread myThread = new MyThread();

        myThread.start();
        myRunnableThread.start();
    }
}
