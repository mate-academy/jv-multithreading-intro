package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread("Number Thread");
        Thread myRunnable = new Thread(new MyRunnable(), "Daemon thread");
        myRunnable.setDaemon(true);
        myThread.start();
        myRunnable.start();
    }
}
