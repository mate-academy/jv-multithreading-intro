package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method was called \n\n----------------------\n");

        Thread myThread = new MyThread();
        Runnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        myRunnableThread.setDaemon(true);

        myThread.start();
        myRunnableThread.start();
    }
}
