package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread thread = new MyThread();
        Runnable runnable = new MyRunnable();
        Thread runnableThread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        runnableThread.start();
    }
}
