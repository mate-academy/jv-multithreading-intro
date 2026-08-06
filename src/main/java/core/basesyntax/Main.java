package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("MyThread");
        t1.start();

        MyRunnable t2 = new MyRunnable();
        Thread runnamleThread = new Thread(t2,"MyRunnable");
        runnamleThread.setDaemon(true);
        runnamleThread.start();
        Thread.sleep(1000);
    }
}
