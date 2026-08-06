package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        Runnable runnable = new MyRunnable();
        Thread myRunnable = new Thread(runnable);
        myRunnable.setDaemon(true);
        myRunnable.start();
    }
}
