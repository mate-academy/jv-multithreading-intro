package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread myRunnableThread = new Thread(new MyRunnable());

        myRunnableThread.setDaemon(true);

        myThread.start();
        myRunnableThread.start();

        try {
            myThread.join();
        } catch (InterruptedException e) {
            System.err.println("Error joining MyThread: " + e.getMessage());
        }
    }
}
