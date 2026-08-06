package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        MyRunnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        myRunnableThread.setDaemon(true);
        myRunnableThread.start();

        MyThread myThread = new MyThread();
        myThread.start();

    }
}
