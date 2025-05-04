package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable demon = new MyRunnable();
        Thread runDemon = new Thread(demon);
        runDemon.setDaemon(true);
        Thread myThread = new MyThread();

        runDemon.start();
        myThread.start();
    }
}
