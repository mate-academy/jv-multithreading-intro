package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        Thread demonThread = new Thread(new MyRunnable());
        demonThread.setDaemon(true);
        demonThread.start();
    }
}
