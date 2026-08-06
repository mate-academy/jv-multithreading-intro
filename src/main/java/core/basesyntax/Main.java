package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyRunnable runnable = new MyRunnable();
        myThread.setDaemon(true);
        myThread.start();
        runnable.run();
    }
}
