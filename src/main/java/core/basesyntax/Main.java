package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();

        MyThread daemonThread = new MyThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
