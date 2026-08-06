package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread daemon = new MyThread();
        daemon.setDaemon(true);

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);

        daemon.start();
        thread.start();
    }
}
