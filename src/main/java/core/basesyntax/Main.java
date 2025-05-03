package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new MyThread();

        MyRunnable runnable = new MyRunnable();
        Thread secondThread = new Thread(runnable);
        secondThread.setDaemon(true);

        firstThread.start();
        secondThread.start();
    }
}
