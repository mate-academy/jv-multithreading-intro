package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // Create the first thread by extending Thread
        MyThread myThread = new MyThread();

        // Create the second thread by implementing Runnable
        MyRunnable myRunnable = new MyRunnable();
        Thread daemonThread = new Thread(myRunnable);

        // Set the second thread as a daemon thread
        daemonThread.setDaemon(true);

        // Start both threads
        myThread.start();
        daemonThread.start();
    }
}
