package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread threadFirst = new Thread(new MyRunnable());
        threadFirst.setDaemon(true);
        threadFirst.start();

        Thread threadSecond = new MyThread();
        threadSecond.start();
    }
}
