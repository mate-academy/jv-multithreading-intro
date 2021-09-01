package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread MyThread = new MyThread();
        MyThread.setDaemon(true);
        MyThread.start();

        Thread MyRunnableThread = new Thread(new MyRunnable());
        MyRunnableThread.start();
    }
}
