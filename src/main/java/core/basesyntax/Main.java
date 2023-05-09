package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.setDaemon(true);
        MyThread myThread = new MyThread();
        myRunnable.start();
        myThread.start();
    }
}
