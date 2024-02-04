package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        Thread myRunnableThread = new Thread(new MyRunnable());
        myThread.start();
        myRunnableThread.setDaemon(true);
        myRunnableThread.start();
    }
}
