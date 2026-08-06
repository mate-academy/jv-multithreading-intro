package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread first = new MyThread();
        Thread second = new Thread(new MyRunnable());
        second.setDaemon(true);
        first.start();
        second.start();
    }
}
