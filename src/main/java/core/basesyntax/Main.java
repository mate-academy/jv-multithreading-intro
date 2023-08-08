package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new MyThread();
        Runnable secondTread = new MyRunnable();
        Thread secondRunnableThread = new Thread(secondTread);

        firstThread.start();
        secondRunnableThread.setDaemon(true);
        secondRunnableThread.start();
    }
}
