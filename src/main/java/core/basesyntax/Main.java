package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread myRunnableTread = new Thread(myRunnable);
        Thread myThread = new MyThread();

        myThread.setDaemon(true);
        myThread.start();
        myRunnableTread.start();
    }
}
