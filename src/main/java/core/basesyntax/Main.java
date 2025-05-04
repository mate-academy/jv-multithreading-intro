package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread userThread = new MyThread();
        userThread.start();
        MyRunnable runnable = new MyRunnable();
        Thread daemonThread = new Thread(runnable);
        daemonThread.start();
    }
}
