package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myRunnable = new Thread(new MyRunnable());
        MyThread myThread = new MyThread();
        myRunnable.setDaemon(true);
        myThread.start();
        myRunnable.start();
    }
}
