package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.setDaemon(true);
        t.start();

        Thread r = new Thread(new MyRunnable());
        r.start();
    }
}
