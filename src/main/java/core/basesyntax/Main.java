package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread secondThread = new Thread(myRunnable);
        firstThread.start();
        secondThread.setDaemon(true);
        secondThread.start();
    }
}
