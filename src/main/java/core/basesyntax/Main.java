package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread myRunnableThread = new Thread(runnable);
        Thread myThreadThread = new MyThread();
        myThreadThread.setDaemon(true);
        myThreadThread.start();
        myRunnableThread.start();
    }
}
