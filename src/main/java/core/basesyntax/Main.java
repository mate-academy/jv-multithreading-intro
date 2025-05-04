package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Runnable runnableThread = new MyRunnable();
        Thread myRunnable = new Thread(runnableThread);
        myRunnable.setDaemon(true);
        myRunnable.start();
        myThread.start();
    }
}
