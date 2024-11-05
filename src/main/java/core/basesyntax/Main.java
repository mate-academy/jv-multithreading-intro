package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);


        Runnable runnable = new MyRunnable();
        Thread myThread1 = new Thread(runnable);

        myThread.start();
        myThread1.start();
    }
}
