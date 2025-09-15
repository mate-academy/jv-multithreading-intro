package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new MyThread("first");
        Runnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable, "second");
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();
    }
}
