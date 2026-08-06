package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnableThread = new MyRunnable();
        runnableThread.run();
        Thread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();
    }
}
