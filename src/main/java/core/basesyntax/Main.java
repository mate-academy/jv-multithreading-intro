package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread firstThread = new Thread(myRunnable);
        MyThread secondThread = new MyThread();
        secondThread.setDaemon(true);
        firstThread.start();
        secondThread.start();
    }
}
