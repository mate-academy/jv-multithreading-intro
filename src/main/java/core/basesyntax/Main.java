package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        thread.start();
    }
}
