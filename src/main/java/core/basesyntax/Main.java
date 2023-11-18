package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread thr1 = new MyThread();
        Thread thr2 = new Thread(new MyRunnable());

        thr1.setDaemon(true);
        thr1.start();
        thr2.start();
    }
}
