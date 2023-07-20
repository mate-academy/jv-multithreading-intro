package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();
        myThread.setDaemon(true);
        myThread.start();
    }
}
