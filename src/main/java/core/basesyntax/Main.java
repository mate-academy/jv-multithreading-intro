package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread newThread = new MyThread();
        MyRunnable runnableThread = new MyRunnable();
        Thread newRunableThread = new Thread(runnableThread);
        newRunableThread.setDaemon(true);
        newRunableThread.start();
        newThread.start();
    }
}
