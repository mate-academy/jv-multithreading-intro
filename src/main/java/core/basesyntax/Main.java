package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Runnable toThread = new MyRunnable();
        Thread fromRunnable = new Thread(toThread);
        fromRunnable.start();
        Thread fromThread = new MyThread();
        fromThread.setDaemon(true);
        fromThread.start();
    }
}

