package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setDaemon(true);

        Thread runnableThread = new Thread(new MyRunnable());

        runnableThread.start();
        thread.start();
    }
}
