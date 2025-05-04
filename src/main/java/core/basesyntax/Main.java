package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        // write your code here
        MyThread newThread = new MyThread();
        MyRunnable runnableThread = new MyRunnable();
        Thread newRunnableThread = new Thread(runnableThread);

        newRunnableThread.setDaemon(true);
        newRunnableThread.start();
        newThread.start();
    }
}
