package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread first = new MyThread();
        Runnable runnable = new MyRunnable();
        Thread second = new Thread(runnable);
        second.setDaemon(true);

        first.start();
        second.start();
    }
}
