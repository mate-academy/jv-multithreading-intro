package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread anotherThread = new Thread(myRunnable);
        anotherThread.start();
    }
}
