package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread daemon = new MyThread();
        Thread user = new Thread(new MyRunnable());
        daemon.setDaemon(true);
        daemon.start();
        user.start();
    }
}
