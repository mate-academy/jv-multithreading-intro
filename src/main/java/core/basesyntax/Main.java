package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread first = new MyThread();
        Runnable second = new MyRunnable();
        Thread sec = new Thread(second);
        first.setDaemon(true);
        first.start();
        sec.start();
    }
}
