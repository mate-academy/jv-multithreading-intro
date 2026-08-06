package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread myThreadCount = new MyThread();

        Runnable myRunnableInfinite = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnableInfinite);
        myRunnableThread.setDaemon(true);

        myRunnableThread.start();
        myThreadCount.start();
    }
}
