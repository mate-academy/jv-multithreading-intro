package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread firstThread = new MyThread();

        Runnable runnable = new MyRunnable();
        Thread secondThread = new Thread(runnable);
        secondThread.setDaemon(true);

        firstThread.start();
        secondThread.start();
    }
}
