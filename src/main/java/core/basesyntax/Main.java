package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        Thread myThread = new MyThread();
        myThread.setDaemon(true);
        myRunnableThread.start();
        myThread.start();
    }
}
