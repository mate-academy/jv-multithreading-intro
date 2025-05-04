package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new MyThread();
        firstThread.start();
        Runnable runnable = new MyRunnable();
        Thread secondThread = new Thread(runnable);
        secondThread.setDaemon(true);
        secondThread.start();
    }
}
