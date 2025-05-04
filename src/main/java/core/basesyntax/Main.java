package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();

        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.setDaemon(true);
        myRunnableThread.start();
    }
}
