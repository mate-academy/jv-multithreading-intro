package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable, "lol");
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
    }
}
