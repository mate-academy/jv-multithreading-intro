package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // Creating and starting the thread that extends Thread
        MyThread myThread = new MyThread();
        myThread.start();

        // Creating and starting the thread that implements Runnable as a daemon thread
        Thread daemonThread = new Thread(new MyRunnable());
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
