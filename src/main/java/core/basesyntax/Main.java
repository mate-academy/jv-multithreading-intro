package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        MyThread thread = new MyThread();
        MyRunnable runnable = new MyRunnable();
        Thread runnableDaemon = new Thread(runnable);
        runnableDaemon.setDaemon(true);
        thread.start();
        runnableDaemon.start();
    }
}
