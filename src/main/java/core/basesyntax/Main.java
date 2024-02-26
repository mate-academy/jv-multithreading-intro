package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();

        MyRunnable runnable = new MyRunnable();
        Thread threadRunnable = new Thread(runnable);
        threadRunnable.start();
    }
}
