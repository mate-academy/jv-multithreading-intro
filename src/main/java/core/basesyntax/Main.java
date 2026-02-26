package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread t = new MyThread();
        Runnable r = new MyRunnable();
        t.setDaemon(true);

        t.start();
        new Thread(r).start();
    }
}
