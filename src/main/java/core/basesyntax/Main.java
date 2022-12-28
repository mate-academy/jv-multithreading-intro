package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread firstTread = new MyThread();
        Runnable myRunnable = new MyRunnable();
        Thread secondThread = new Thread(myRunnable);
        firstTread.setDaemon(true);
        firstTread.start();
        secondThread.start();
    }
}
