package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        MyThread thread2 = new MyThread();
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
    }
}
