package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread first = new Thread(new MyRunnable());
        Thread second = new MyThread();
        first.setDaemon(true);
        first.start();
        second.start();
    }
}
