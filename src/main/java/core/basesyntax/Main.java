package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread numberThread = new MyThread();

        Thread daemonThread = new Thread(new MyRunnable());

        daemonThread.setDaemon(true);

        numberThread.start();
        daemonThread.start();

        System.out.println("Main thread finished.");
    }
}
