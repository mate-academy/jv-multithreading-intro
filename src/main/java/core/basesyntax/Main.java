package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        runnable.run();

        MyThread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();
    }
}
