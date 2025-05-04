package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread(true);
        thread.setDaemon(true);
        MyRunnable runnable = new MyRunnable();
        Thread runnableThread = new Thread(runnable);
        thread.start();
        runnableThread.start();
    }
}
