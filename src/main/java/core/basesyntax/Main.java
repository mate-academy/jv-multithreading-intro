package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();
        Thread thread2 = new MyThread();
        thread2.setDaemon(true);
        thread2.start();
    }
}
