package core.basesyntax;

import core.basesyntax.thread.MyRunnable;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new Thread();
        myThread.start();

        Runnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        myRunnableThread.setDaemon(true);
        myRunnableThread.start();
    }
}
