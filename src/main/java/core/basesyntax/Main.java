package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Thread runThread = new Thread(new MyRunnable());
        runThread.setDaemon(true);
        myThread.start();
        runThread.start();
    }
}
