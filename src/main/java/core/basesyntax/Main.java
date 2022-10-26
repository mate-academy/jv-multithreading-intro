package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread currentThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        currentThread.start();
        myRunnableThread.setDaemon(true);
        myRunnableThread.start();
    }
}
