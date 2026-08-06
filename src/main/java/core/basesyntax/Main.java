package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread tread = new MyThread();
        Runnable runnable = new MyRunnable();
        Thread deamonthread = new Thread(runnable);
        deamonthread.setDaemon(true);

        tread.start();
        deamonthread.start();
    }
}
