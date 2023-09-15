package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread threadRunnable = new Thread(myRunnable);
        Thread thread = new MyThread();
        threadRunnable.setDaemon(true);
        threadRunnable.start();
        thread.start();
    }
}
