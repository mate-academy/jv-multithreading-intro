package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnableThread = new MyRunnable();
        Thread newThread = new Thread(runnableThread);
        newThread.setDaemon(true);
        newThread.start();
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
