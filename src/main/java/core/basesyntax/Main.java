package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnableThread = new MyRunnable();
        Thread newRunnableThread = new Thread(runnableThread);
        Thread myThread = new MyThread();
        myThread.setDaemon(true);
        newRunnableThread.start();
        myThread.start();
    }
}
