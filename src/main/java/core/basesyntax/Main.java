package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread runnableThread = new Thread(new MyRunnable());
        runnableThread.setDaemon(true);
        runnableThread.start();

        Thread thread = new MyThread();
        thread.start();
    }
}
