package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread myRunnableThred = new Thread(myRunnable);
        myRunnableThred.setDaemon(true);
        myThread.start();
        myRunnableThred.start();
    }
}
