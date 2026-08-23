package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new MyThread();
        myThread.start();
        
        Runnable runnable = new MyRunnable();
        Thread myRunnableThread = new Thread(runnable);
        myRunnableThread.setDaemon(true);
        myRunnableThread.start();
        
        Thread.sleep(2400);
        System.out.println("main thread is done");
    }
}
