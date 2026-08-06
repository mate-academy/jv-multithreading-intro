package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread daemonThread = new MyThread();
        daemonThread.setDaemon(true);

        Thread counterThread = new Thread(new MyRunnable());

        daemonThread.start();
        counterThread.start();

    }
}
