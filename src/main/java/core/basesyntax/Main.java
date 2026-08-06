package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread firstThread = new Thread(myRunnable);
        firstThread.setDaemon(true);
        firstThread.start();

        Thread secondThread = new MyThread();
        secondThread.start();
    }
}
