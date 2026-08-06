package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Runnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
    }
}
