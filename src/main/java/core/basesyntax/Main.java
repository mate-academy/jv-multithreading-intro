package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread demonThread = new MyThread();
        Thread thread = new Thread(new MyRunnable());
        demonThread.setDaemon(true);

        demonThread.start();
        thread.start();
    }
}
