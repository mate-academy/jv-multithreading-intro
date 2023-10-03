package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread thread = new MyThread();

        Runnable myRunnable = new MyRunnable();
        Thread threadRunnable = new Thread(myRunnable);
        threadRunnable.setDaemon(true);

        threadRunnable.start();
        thread.start();
    }
}
