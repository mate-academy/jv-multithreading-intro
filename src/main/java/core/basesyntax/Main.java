package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Thread myRunnable = new Thread(new MyRunnable());

        myThread.start();
        myRunnable.setDaemon(true);
        myRunnable.start();
    }
}
