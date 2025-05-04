package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread threadDaemon = new MyThread();
        threadDaemon.setDaemon(true);
        Thread threadCounter = new Thread(new MyRunnable());

        threadDaemon.start();
        threadCounter.start();
    }
}
