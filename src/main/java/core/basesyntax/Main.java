package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread threadRunnable = new Thread(runnable);
        threadRunnable.start();
        MyThread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();
    }
}
