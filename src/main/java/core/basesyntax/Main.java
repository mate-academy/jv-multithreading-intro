package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myRunnableDemon = new Thread(myRunnable);
        myRunnableDemon.setDaemon(true);
        myRunnableDemon.start();

        MyThread myThread = new MyThread();
        myThread.start();
    }
}
