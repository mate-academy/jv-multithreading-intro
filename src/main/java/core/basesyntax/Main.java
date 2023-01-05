package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread userThread = new MyThread();
        Runnable runnableObject = new MyRunnable();
        Thread demonThread = new Thread(runnableObject);
        demonThread.setDaemon(true);
        demonThread.start();
        userThread.start();
    }
}
