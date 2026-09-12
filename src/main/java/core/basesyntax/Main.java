package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        MyRunnable runnable = new MyRunnable();
        Thread deamonTread = new Thread(runnable);
        deamonTread.setDaemon(true);
        deamonTread.start();
    }
}
