package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Thread demon = new Thread(new MyRunnable());
        myThread.start();
        demon.setDaemon(true);
        demon.start();

    }
}
