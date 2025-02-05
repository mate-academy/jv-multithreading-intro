package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();

        MyRunnable runnable = new MyRunnable();
        Thread runnableTread = new Thread(runnable);
        runnableTread.setDaemon(true);

        thread.start();
        runnableTread.start();
    }
}

