package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        MyThread myThread = new MyThread();

        Thread myRunnableThread = new Thread(myRunnable);
        myRunnableThread.setDaemon(true);

        myRunnableThread.start();
        myThread.start();
    }
}
