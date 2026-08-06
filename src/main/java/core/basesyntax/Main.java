package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        thread1.setDaemon(true);

        Thread thread2 = new MyThread();

        thread1.start();
        thread2.start();

    }
}
