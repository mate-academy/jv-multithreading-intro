package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    static final MyThread mythread = new MyThread();
    static final MyRunnable myRunnable = new MyRunnable();
    static final Thread myRunnableThread = new Thread(myRunnable);

    public static void main(String[] args) {
        // Create Thread objects that extends Thread and implement Runnable interface as targets
        // Start the threads
        System.out.println("Launch MyThread class");
        mythread.start();
        System.out.println("Launch MyRunnable class");
        myRunnableThread.start();
    }
}
