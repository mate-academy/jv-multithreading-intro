package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Runnable myRunnable = new MyRunnable();
        Thread myDemonThread = new Thread(myRunnable);
        myDemonThread.setDaemon(true);
        myThread.start();
        myDemonThread.start();
    }
}
