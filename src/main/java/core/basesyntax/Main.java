package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread daemonThread = new Thread(new MyRunnable());
        daemonThread.setDaemon(true);

        thread.start();
        daemonThread.start();
    }
}
