package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new MyThread();
        Thread runnableThread = new Thread(runnable);
        runnableThread.start();
        thread.start();
    }
}
