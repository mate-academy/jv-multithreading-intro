package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myRunnableTread = new Thread(new MyRunnable());
        Thread myTreadDaemonTread = new MyThread();
        myTreadDaemonTread.setDaemon(true);

        myRunnableTread.start();
        myTreadDaemonTread.start();
    }
}
