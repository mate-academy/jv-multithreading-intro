package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        thread1.setDaemon(true);
        Runnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
