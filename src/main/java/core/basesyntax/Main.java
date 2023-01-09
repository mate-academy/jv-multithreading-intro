package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        Thread threadDaemon = new Thread(new MyRunnable());
        threadDaemon.setDaemon(true);
        threadDaemon.start();
    }
}
