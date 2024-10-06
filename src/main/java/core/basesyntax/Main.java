package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new MyThread("my thread 1");
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread runnableThread = new Thread(myRunnable, "my runnable 1");
        runnableThread.setDaemon(true);
        runnableThread.start();

        Thread.sleep(1000L);
    }
}
