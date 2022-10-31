package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread first = new MyThread();
        Runnable myRunnable = new MyRunnable();
        Thread second = new Thread(myRunnable);
        second.setDaemon(true);
        first.start();
        second.start();
    }
}
