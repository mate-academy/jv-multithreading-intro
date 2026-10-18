package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runbl = new MyRunnable();
        Thread thread = new Thread(runbl);
        thread.start();
        MyThread thrd = new MyThread();
        thrd.setDaemon(true);
        thrd.start();
    }
}
