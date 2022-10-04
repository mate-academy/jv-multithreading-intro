package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {

        Runnable myRunable = new MyRunnable();
        Thread myRunableThread = new Thread(myRunable);
        Thread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        myRunableThread.start();

    }
}
