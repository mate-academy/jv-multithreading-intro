package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable newThread = new MyRunnable();
        Thread newThread1 = new Thread(newThread);
        newThread1.start();

        MyThread myThread1 = new MyThread();
        myThread1.setDaemon(true);
        myThread1.start();
    }
}
