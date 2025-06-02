package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread daemon = new MyThread();
        daemon.setDaemon(true);
        daemon.start();
        Thread main = new Thread(new MyRunnable());
        main.start();
    }
}
