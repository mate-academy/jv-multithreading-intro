package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Runnable myRunnable = new MyRunnable();
        myThread.setDaemon(true);

        myThread.start();
        Thread myRunnableThread = new Thread(myRunnable);
        myRunnableThread.start();

    }
}
