package core.basesyntax;

import core.basesyntax.thread.MyThread;
import core.basesyntax.thread.MyRunnable;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyRunnable());
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();
    }
}
