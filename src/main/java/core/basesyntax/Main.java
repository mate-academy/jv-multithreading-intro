package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        MyRunnable deamonThread = new MyRunnable();

        thread.setDaemon(true);
        thread.start();
        deamonThread.run();
    }
}
