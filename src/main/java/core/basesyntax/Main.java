package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread demon = new MyThread();
        demon.setDaemon(true);
        Runnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);

        demon.start();
        myThread.start();
    }
}
