package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myFirstThread = new MyThread();

        Runnable myRunnable = new MyRunnable();
        Thread mySecondThread = new Thread(myRunnable);
        mySecondThread.setDaemon(true);

        myFirstThread.start();
        mySecondThread.start();
    }
}
