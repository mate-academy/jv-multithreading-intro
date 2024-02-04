package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread demon = new MyThread();
        demon.setDaemon(true);
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        demon.start();
        thread.start();
    }
}
