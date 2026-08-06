package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread tread1 = new MyThread();
        Thread daemonTread = new Thread(new MyRunnable());
        daemonTread.setDaemon(true);
        tread1.run();
        daemonTread.run();
    }
}
