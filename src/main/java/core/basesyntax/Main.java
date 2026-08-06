package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread runnableThread = new Thread(myRunnable);
        MyThread myThread = new MyThread();
        runnableThread.setDaemon(true);
        myThread.start();
        runnableThread.start();
    }
}
