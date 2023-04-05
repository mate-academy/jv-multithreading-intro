package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        MyThread myThread = new MyThread();
        myRunnableThread.setDaemon(true);
        myThread.start();
        myRunnableThread.start();
    }
}
