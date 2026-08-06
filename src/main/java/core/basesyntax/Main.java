package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread("Default thread");
        myThread.start();

        Thread myRunnable = new MyRunnable("Daemon thread");
        myRunnable.setDaemon(true);
        myRunnable.start();
    }
}
