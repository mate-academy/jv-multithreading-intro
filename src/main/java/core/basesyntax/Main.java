package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        MyRunnable runable = new MyRunnable();
        Thread thread1 = new Thread(runable);
        thread1.setDaemon(true);
        thread.start();
        thread1.start();
    }
}
