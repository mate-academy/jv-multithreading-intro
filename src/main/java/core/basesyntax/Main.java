package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread daemon = new MyThread();
        daemon.setDaemon(true);
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        daemon.start();

    }
}
