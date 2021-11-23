package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.setDaemon(true);
        MyRunnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        myRunnableThread.start();
        myThread.start();
    }
}
