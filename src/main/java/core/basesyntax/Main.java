package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start the thread");
        MyRunnable myRunnable = new MyRunnable();
        Thread runnableThread = new Thread(myRunnable);
        runnableThread.start();
        Thread myTread = new MyThread();
        myTread.setDaemon(true);
        myTread.start();
        Thread.sleep(1000L);
        System.out.println("Time to sleep");
    }
}
