package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new MyThread();
        firstThread.start();
        MyRunnable myRunnableThread = new MyRunnable();
        Thread secondThread = new Thread(myRunnableThread);
        secondThread.setDaemon(true);
        secondThread.start();
    }
}
