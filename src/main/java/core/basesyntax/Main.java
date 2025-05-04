package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new MyThread("My thread");
        myThread.start();

        Thread myRunnableThread = new Thread(new MyRunnable(), "My runnableThread");
        myRunnableThread.setDaemon(true);
        myRunnableThread.start();
    }
}
