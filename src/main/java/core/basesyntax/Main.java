package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new MyThread();
        Thread myRunnableThread = new Thread(myRunnable);
        myThread.setDaemon(true);
        myThread.start();
        myRunnableThread.start();
    }
}
