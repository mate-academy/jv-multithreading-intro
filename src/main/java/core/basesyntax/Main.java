package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread first = new MyThread();
        first.setDaemon(true);
        first.start();
        Thread second = new Thread(new MyRunnable());
        second.start();
    }
}
