package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Runnable runnableThread = new MyRunnable();
        Thread deamonThread = new Thread(runnableThread);
        deamonThread.setDaemon(true);
        deamonThread.start();

        Thread userThread = new MyThread();
        userThread.start();
    }
}
