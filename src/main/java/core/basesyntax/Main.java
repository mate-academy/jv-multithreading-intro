package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();

        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.setDaemon(true);
        thread1.start();
    }
}
