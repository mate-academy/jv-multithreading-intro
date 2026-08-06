package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread numberThread = new MyThread();
        numberThread.start();

        Thread myRunnable = new Thread(new MyRunnable(), "Runnable thread");
        myRunnable.setDaemon(true);
        myRunnable.start();
    }
}
