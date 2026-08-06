package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setDaemon(true);
        t1.start();

        Thread t2 = new Thread(new MyRunnable(21));
        t2.start();
    }
}
