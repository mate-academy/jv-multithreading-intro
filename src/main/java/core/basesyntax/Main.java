package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread("MyThread 1");
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread runnableThread = new Thread(myRunnable, "MyRunnable 1");
        runnableThread.setDaemon(true);
        runnableThread.start();

    }
}
