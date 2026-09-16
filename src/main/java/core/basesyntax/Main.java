package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread threadByExtending = new MyThread();
        MyRunnable runnable = new MyRunnable();
        Thread threadByImplementing = new Thread(runnable);
        threadByImplementing.setDaemon(true);
        threadByExtending.start();
        threadByImplementing.start();
    }
}
