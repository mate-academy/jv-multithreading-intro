package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static final boolean SET_DAEMON = true;

    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Thread runnableThread = new Thread(new MyRunnable());
        myThread.setDaemon(SET_DAEMON);
        myThread.start();
        runnableThread.start();
    }
}
