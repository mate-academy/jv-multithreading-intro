package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread daemonThread = new Thread(myRunnable);
        daemonThread.start();
        myThread.start();
    }
}
