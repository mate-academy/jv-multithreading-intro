package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        myThread.setDaemon(true);
        myThread.start();
        myRunnable.run();

    }
}
