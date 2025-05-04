package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread firstThread = new MyThread();
        firstThread.start();

        MyRunnable runnableThread = new MyRunnable();
        Thread secondThread = new Thread(runnableThread);
        secondThread.setDaemon(true);
        secondThread.start();
    }
}
