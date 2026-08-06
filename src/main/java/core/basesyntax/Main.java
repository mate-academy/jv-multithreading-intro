package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        MyThread daemonThread = new MyThread();
        Thread countThread = new Thread(new MyRunnable());
        daemonThread.setDaemon(true);
        countThread.start();
        daemonThread.start();
    }
}
