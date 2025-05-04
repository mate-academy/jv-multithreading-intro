package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread firstTread = new MyThread();
        Runnable myRunnable = new MyRunnable();
        Thread secondTread = new Thread(myRunnable);
        secondTread.setDaemon(true);
        firstTread.start();
        secondTread.start();
    }
}
