package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new MyThread();
        Runnable myRunnable = new MyRunnable();
        Thread secondThread = new Thread(myRunnable);
        secondThread.setDaemon(true);
        firstThread.start();
        secondThread.start();
    }
}
