package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        MyRunnable runnableThread = new MyRunnable();
        Thread myRunnableThread = new Thread(runnableThread);
        myRunnableThread.setDaemon(true);

        myThread.start();
        myRunnableThread.start();
    }
}
