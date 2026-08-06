package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread thread1 = new MyThread();
        Thread thread2 = new Thread(myRunnable);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();
    }
}
