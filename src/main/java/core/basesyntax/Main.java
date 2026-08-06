package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread firstThread = new MyThread();
        MyRunnable runnable = new MyRunnable();
        Thread secondThread = new Thread(runnable);

        firstThread.start();

        secondThread.setDaemon(true);
        secondThread.start();
    }
}
