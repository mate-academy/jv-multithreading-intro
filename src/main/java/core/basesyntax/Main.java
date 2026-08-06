package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread runnable = new Thread(myRunnable);
        runnable.setDaemon(true);

        thread.start();
        runnable.start();
    }
}
