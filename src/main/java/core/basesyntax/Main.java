package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyRunnable secondRunnableThread = new MyRunnable();
        Thread secondThread = new Thread(secondRunnableThread);
        secondThread.setDaemon(true);
        MyThread firstThread = new MyThread();
        firstThread.start();
        secondThread.start();
    }
}
